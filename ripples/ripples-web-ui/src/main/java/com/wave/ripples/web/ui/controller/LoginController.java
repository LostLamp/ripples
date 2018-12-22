package com.wave.ripples.web.ui.controller;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.web.ui.api.MemberApi;
import com.wave.ripples.web.ui.dto.Member;
import org.apache.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

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
    public String login(String loginId, String password, HttpServletRequest request, Model model) throws Exception {
        // 调用 API 方法
        Member member = MemberApi.login(loginId, password);

        if (member == null) {
            model.addAttribute("baseResult", BaseResult.fail("用户名或密码错误，请重新输入！"));
            return "login";

        }
        //
        else {
            // 将会员信息放入回话中
            request.getSession().setAttribute("member", member);
            return "redirect:/index";
        }
    }

    /**
     * 注销
     *
     * @param request
     * @return
     */
    @GetMapping(value = "logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();

        return "redirect:/login";
    }
}
