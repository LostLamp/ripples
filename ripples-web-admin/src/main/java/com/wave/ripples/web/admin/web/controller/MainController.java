package com.wave.ripples.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 主页拦截器，如果没登陆就跳转到登陆页面
 * */
@Controller
public class MainController {

    @GetMapping(value = {"", "test"})
    public String main() {
        return "test";
    }
}
