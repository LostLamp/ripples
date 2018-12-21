package com.wave.ripples.web.ui.web.controller;

import com.wave.ripples.domain.Member;
import com.wave.ripples.web.ui.constants.SystemConstants;

import com.wave.ripples.web.ui.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 跳转到登陆页
     * @return
     */
    @GetMapping(value ={"login"})
    public String login(){
        return "login";
    }

    /**
     * 登陆判断
     * @param loginId  用户名，邮箱，电话
     * @param password 密码
     * @return
     */
    @PostMapping(value = "login")
    public String login(Model model, HttpServletRequest request, String loginId, String password){
        Member member = loginService.login(loginId, password);
        //登陆成功
        if(member!=null){
            request.getSession().setAttribute(SystemConstants.CHEK_KEY_MEMBER,member);
            return "redirect:/main";
        }else {
            model.addAttribute(SystemConstants.MESSAGE,"你用户名或密码错误，请重新你输入");
            return "login";
        }

    }
    /**
     * 注销登录
     * @return
     */
    @GetMapping(value = "logout")
    public String logout(){
        return "redirect:/login";
    }
}
