package com.wave.ripples.web.admin.abstracts;

import com.wave.ripples.commons.constants.SystemConstants;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.commons.BeanValidator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 控制器基类
 * <p>Title: AbstractBaseController</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/11/30 10:56
 */
public abstract class AbstractBaseController<M> {

    protected boolean beanValidator(Member member, Model model) {
        return checkBeanValidator(member, model);
    }

    protected boolean beanValidator(Member member, RedirectAttributes redirectAttributes) {
        return checkBeanValidator(member, redirectAttributes);
    }

    protected void addMessage(Model model, String message) {
        model.addAttribute(SystemConstants.MESSAGE, message);
    }

    protected void addMessage(RedirectAttributes redirectAttributes, String message) {
        redirectAttributes.addFlashAttribute(SystemConstants.MESSAGE, message);
    }

    /**
     * 检查 Bean
     */
    private boolean checkBeanValidator(Member member, Model model) {
        String result = BeanValidator.validator(member);
        // 验证失败
        if (StringUtils.isNoneBlank(result)) {
            if (model instanceof RedirectAttributes) {
                RedirectAttributes redirectAttributes = (RedirectAttributes) model;
                addMessage(redirectAttributes, result);
            } else {
                addMessage(model, result);
            }
            return false;
        }

        // 验证成功
        else {
            return true;
        }
    }
}
