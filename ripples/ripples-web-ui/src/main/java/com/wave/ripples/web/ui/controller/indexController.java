package com.wave.ripples.web.ui.controller;

import com.wave.ripples.web.ui.api.MemberApi;
import com.wave.ripples.web.ui.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    /**
     * 跳转首页
     *
     * @return
     */
    @GetMapping(value = {"", "index"})
    public String index(Model model) {
        return "index";
    }
}
