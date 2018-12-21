package com.wave.ripples.web.ui.controller;

import com.wave.ripples.commons.utils.HttpClientUtils;
import com.wave.ripples.commons.utils.MapperUtils;
import com.wave.ripples.web.ui.api.API;
import com.wave.ripples.web.ui.api.MemberApi;
import com.wave.ripples.web.ui.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class indexController {

    /**
     * 跳转首页
     *
     * @return
     */
    @GetMapping(value = {"", "index"})
    public String index(Model model) {
        Member memberByLoginId = MemberApi.findMemberByLoginId("lisi");
        model.addAttribute("member", memberByLoginId);
        return "index";
    }
}
