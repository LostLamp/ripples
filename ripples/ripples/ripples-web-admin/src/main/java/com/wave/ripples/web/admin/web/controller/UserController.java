package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.commons.constants.Constants;
import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * 用户管理
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController<Member, IUserService> {

    /**
     * 跳转列表页
     */
    @GetMapping(value = "list")
    public String list() {
        return "user/list";
    }

    /**
     * 跳转表单页
     */
    @GetMapping(value = "form")
    public String form() {
        return "user/form";
    }

    /**
     * 保存
     */
    @PostMapping(value = "save")
    public String save(Model model, RedirectAttributes redirectAttributes, Member member){
        BaseResult result = service.save(member);
        if(result.getMessage().contains("成功")){
            addMessage(redirectAttributes,result);
            return "redirect:/user/list";
        }
        addMessage(model,result);
        return "/user/form";
    }

    /**
     * 删除
     */
    @GetMapping(value = "delete")
    public String delete(Member member){
        service.delete(member.getMemberId());
        return "redirect:/user/list";
    }
    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @ResponseBody
    @PostMapping(value = "delete/select")
    public String deleteMulti(String ids) {
        // 成功结果
        String base_result_success = Constants.Base_RESULT_SUCCESS;
        // 前段传递的 id JSON数据 不为空进行删除
        if (StringUtils.isNotBlank(ids)) {
            // 将 JSON 转换成数组
            String[] idArray = ids.split(",");
            service.deleteMulti(idArray);

            return base_result_success;
        }
        // 删除失败
        return "删除失败！";
    }
}
