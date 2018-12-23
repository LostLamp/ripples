package com.wave.ripples.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 主页拦截器，如果没登陆就跳转到登陆页面
 * */
@Controller
public class MainController {

    @GetMapping(value = {"", "main"})
    public String main() {
        return "main";
    }

    /**
     * 注销
     * @param request
     * @return
     */
    @GetMapping(value = "logout")
    public String logout(HttpServletRequest request){
        //清除session
        request.getSession().invalidate();
        return "login";
    }
}
