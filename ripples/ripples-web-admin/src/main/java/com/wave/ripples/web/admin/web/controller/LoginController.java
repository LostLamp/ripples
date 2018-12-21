package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.commons.constants.SystemConstants;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpServletRequest;

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

    /**
     * 判断登录结果
     * */
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

    /**
     * 注销
     */
    @GetMapping(value = "logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/login";
    }
}
