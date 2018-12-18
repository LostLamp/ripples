package com.wave.ripples.web.ui.controller;

import com.wave.ripples.web.ui.entity.TbMember;
import com.wave.ripples.web.ui.service.TbMemberLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TbMemberLoginController {
    @Autowired
    private TbMemberLoginService tbMemberLoginService;

    /**
     * 跳转到登陆页
     * @return
     */
    @GetMapping(value ={"","login"})
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
    public String login(Model model,HttpServletRequest request, String loginId, String password){
        TbMember tbMember = tbMemberLoginService.login(loginId, password);
        //登陆成功
        if(tbMember!=null){
            request.getSession().setAttribute("tbMember",tbMember);
            return "redirect:/main";
        }else {
            model.addAttribute("message","你用户名或密码错误，请重新你输入");
            return "login";
        }

    }
    @GetMapping(value = {"main"})
    public String main(){
        return "main";
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
