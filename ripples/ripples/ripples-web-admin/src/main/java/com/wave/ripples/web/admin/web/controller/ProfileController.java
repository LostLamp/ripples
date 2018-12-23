package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.commons.constants.Constants;
import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.service.IProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


/**
 * 管理员个人信息
 * @Author wodef
 * @version 1.0.0
 * @Date 2018/12/19
 */
@Controller
@RequestMapping(value = "profile")
public class ProfileController extends BaseController<Member, IProfileService> {

    /**
     * 跳转个人信息页
     */
    @GetMapping(value = "info")
    public String info() {
        return "profile/info";
    }

    /**
     * 保存个人信息
     *
     * @return
     */
    @PostMapping(value = "save")
    public String save(Member member, Model model, RedirectAttributes redirectAttributes, HttpServletRequest request) {
        //设置修改时间
        member.setUpdated(new Date());
        BaseResult baseResult = service.updateMember(member);

        //保存成功
        if (baseResult.getStatus() == Constants.STATUS_OK){
            //设置响应信息
            addMessage(redirectAttributes,"信息保存成功~");
            request.getSession().setAttribute(Constants.CACHE_KEY_MEMBER,service.selectById(member.getMemberId()));
            return "redirect:/profile/info";
        }
        //保存失败
        else {
            //设置响应信息
            addMessage(model,baseResult);
            return "profile/info";
        }
    }
    /**
     * 修改密码
     */
    @PostMapping(value = "modify/password")
    public String modifyPassword(Member member, RedirectAttributes redirectAttributes) {
        int result = service.changePwd(member);

        boolean flag = false;

        if(result == Member.CHACK_OK){
            flag = true;
            addMessage(redirectAttributes,"密码修改成功~");
        }

        else if(result == Member.CHACK_OLD_PWD_FALSE){
            flag = false;
            addMessage(redirectAttributes,"旧密码和原密码不一致！");
        }

        else {
            flag = false;
            addMessage(redirectAttributes,"新密码不符合规范");

        }

        if(flag){
            return "redirect:/profile/info";
        }
        else {
            return "redirect:/profile/info#tab_1_3";
        }
    }
}
