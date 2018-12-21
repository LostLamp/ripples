package com.wave.ripples.web.ui.controller;

import com.wave.ripples.web.ui.api.MemberApi;
import com.wave.ripples.web.ui.dto.Member;
import org.apache.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class loginController {

    /**
     * 请求登录页面
     *
     * @return
     */
    @GetMapping(value = "login")
    public String login() {
        return "login";
    }

    /**
     * 验证登录 id 和密码
     *
     * @param loginId
     * @param password
     * @return
     */
    @PostMapping(value = "login")
    public String login(String loginId, String password, HttpServletRequest request, Model model) {
        Member memberByLoginId = MemberApi.findMemberByLoginId(loginId);
        if (memberByLoginId != null) {
            if (memberByLoginId.getPassword().equals(password)) {
                request.getSession().setAttribute("mamber", memberByLoginId);
                return "redirect:mamber/main";
            }
        }
        model.addAttribute("message", "登录失败，请检查用户名和密码");
        return "login";
    }
}
