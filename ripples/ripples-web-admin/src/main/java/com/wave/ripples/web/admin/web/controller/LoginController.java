package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.commons.constants.Constants;
import com.wave.ripples.commons.utils.EmailSendUtils;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.service.ILoginService;
import com.wave.ripples.web.admin.service.IUserService;
import org.apache.commons.mail.EmailException;
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

    @Autowired
    private EmailSendUtils emailSendUtils;

    @Autowired
    private IUserService userService;

    /**
     * 跳转到登录页
     */
    @GetMapping(value = {"login"})
    public String login() {
        return "login";
    }


    @PostMapping(value = "login")
    public String login(String loginId, String loginPwd, HttpServletRequest request, Model model) throws EmailException {
        Member member = loginService.login(loginId, loginPwd);

        // 登录成功
        if (member != null) {
            request.getSession().setAttribute(Constants.CACHE_KEY_MEMBER, member);
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

    @PostMapping(value = "forget")
    public String forgetPwd(HttpServletRequest request, Model model) throws EmailException {
        String email = request.getParameter("email");
        Member member = loginService.getEmail(email);
        if (member != null){
            int newPassword = (int)(((Math.random() * 9) + 1) * 100000);
            member.setPassword(""+newPassword);
            userService.save(member);
            emailSendUtils.send("找回密码", String.format("新密码为：【%s】",newPassword),member.getEmail());
            model.addAttribute("message","信息发送成功，请注意查收");
        }
        else {
            model.addAttribute("message","邮箱错误！，该邮箱没有注册");
        }
        return "login";
    }
}
