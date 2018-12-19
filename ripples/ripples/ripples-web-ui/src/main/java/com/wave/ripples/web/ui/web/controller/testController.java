package com.wave.ripples.web.ui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }
    @RequestMapping(value = "profile")
    public String profile(){
        return "user/profile";
    }
}
