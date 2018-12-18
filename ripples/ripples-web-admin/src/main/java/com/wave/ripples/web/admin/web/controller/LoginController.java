package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.constants.SystemConstants;
import com.wave.ripples.web.admin.service.ILoginService;
import com.wave.ripples.web.admin.utils.CaptchaUtil;
import com.wave.ripples.web.admin.utils.VerifyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class LoginController {
    @Autowired
    private ILoginService loginService;

    /**
     * 跳转到登录页
     */
    @GetMapping(value = {"login"})
    public String login() {
        return "login";
    }

    // 注册页面（生成验证码）
    @RequestMapping(value = "toRegister")
    public void toRegister(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("image/jpeg");
        VerifyCode vc = new VerifyCode();// 创建验证码类
        BufferedImage image = vc.getImage();// 创建验证码图片
        System.out.println("生成验证码：" + vc.getText());
        request.getSession().setAttribute("verifyCode", vc.getText());
        VerifyCode.output(image, response.getOutputStream());// 输出图片到页面
    }

    @PostMapping(value = "login")
    public String login(String loginId, String loginPwd, HttpServletRequest request, Model model) {
        Member member = loginService.login(loginId, loginPwd);

        // 登录成功
        if (member != null) {
            // 将数据放入缓存
            request.getSession().setAttribute(SystemConstants.CACHE_KEY_MEMBER, member);
            String contextPath = request.getSession().getServletContext().getContextPath();
            System.out.println(contextPath);
            return "redirect:/main";
        }
        // 登录失败
        else {
            model.addAttribute("message", "登录失败，用户名或密码错误");
            return "login";
        }
    }
}
