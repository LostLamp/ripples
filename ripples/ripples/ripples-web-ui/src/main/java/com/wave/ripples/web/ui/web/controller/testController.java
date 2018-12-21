package com.wave.ripples.web.ui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "mian")
    public String main(){
        return "main";
    }
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }
    @GetMapping(value = "test")
    public String test(){
        return "test";
    }
    @GetMapping(value = "personal")
    public String personal(){
        return "user/personal";
    }
    @GetMapping(value = "profile")
    public String profile(){
        return "user/profile";
    }
    @GetMapping(value = "photoes")
    public String photoes(){
        return "photoes/photoes";
    }
}
