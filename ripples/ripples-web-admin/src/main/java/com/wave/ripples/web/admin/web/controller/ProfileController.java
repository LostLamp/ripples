package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.commons.constants.SystemConstants;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.abstracts.AbstractBaseController;
import com.wave.ripples.web.admin.service.IProfileService;
import com.wave.ripples.commons.constants.utils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 * 管理员个人信息
 * @Author wodef
 * @version 1.0.0
 * @Date 2018/12/19
 */
@Controller
@RequestMapping(value = "profile")
public class ProfileController extends AbstractBaseController<Model> {

    @Autowired
    private IProfileService profileService;

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
        String result = profileService.save(member);
        if (StringUtils.isNoneBlank(result)) {
            addMessage(model, result);
            return "profile/info";
        } else {
            // 将更新信息放入 session
            Member sessionUser = (Member) request.getSession().getAttribute(SystemConstants.CACHE_KEY_MEMBER);
            BeanUtils.copyPropertiesIgnoreNull(member, sessionUser);
            request.getSession().setAttribute(SystemConstants.CACHE_KEY_MEMBER, sessionUser);
            addMessage(redirectAttributes, "保存个人信息成功");
        }

        return "redirect:/profile/info";
    }
    /**
     * 修改密码
     */
    @PostMapping(value = "modify/password")
    public String modifyPassword(Member member, RedirectAttributes redirectAttributes) {
        boolean flag = true;

        int result = profileService.modifyPassword(member);

        if (result == Member.CHECK_FAIL_OLD_PASSWORD) {
            flag = false;
            redirectAttributes.addFlashAttribute(SystemConstants.MESSAGE, "旧密码错误，请重新输入");
        } else if (result == Member.CHECK_FAIL_NEW_PASSWORD) {
            flag = false;
            redirectAttributes.addFlashAttribute(SystemConstants.MESSAGE, "新密码不符合规范，请重新输入");
        } else {
            redirectAttributes.addFlashAttribute(SystemConstants.MESSAGE, "密码修改成功");
        }

        if (flag) {
            return "redirect:/profile/info";
        } else {
            return "redirect:/profile/info#tab_1_3";
        }
    }
}
