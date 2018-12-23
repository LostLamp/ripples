package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.commons.constants.Constants;
import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.commons.dto.PageInfo;
import com.wave.ripples.commons.persistence.AbstractBaseEntity;
import com.wave.ripples.web.admin.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Member;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BaseController<T extends AbstractBaseEntity,S extends IBaseService<T>> {
    @Autowired
    S service;

    /**
     * 添加响应信息
     *
     * @param model
     * @param message
     */
    protected void addMessage(Model model, String message) {
        model.addAttribute(Constants.MESSAGE, message);
    }

    protected void addMessage(RedirectAttributes redirectAttributes, String message) {
        redirectAttributes.addFlashAttribute(Constants.STATUS_RESULT, message);
    }

    protected void addMessage(Model model, List<Member> memberList) {
        model.addAttribute(Constants.MESSAGE, memberList);
    }

    protected void addMessage(RedirectAttributes redirectAttributes, BaseResult baseResult) {
        redirectAttributes.addFlashAttribute(Constants.STATUS_RESULT, baseResult.getMessage());
    }

    protected void addMessage(Model model, BaseResult baseResult) {
        model.addAttribute(Constants.STATUS_RESULT, baseResult.getMessage());
    }


    @ModelAttribute
    public T getById(Long id) throws IllegalAccessException, InstantiationException {
        if(id == null){
            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
            T o = (T)clazz.newInstance();
            return o;
        } else {
            return (T) service.selectById(id);
        }
    }

    /**
     * 分页
     * @param request
     * @return
     */
    @ResponseBody
    @PostMapping(value = "page")
    public PageInfo<T> page(HttpServletRequest request, T entity){
        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strDraw == null ? 0 : Integer.parseInt(strStart);
        int length = strDraw == null ? 10 : Integer.parseInt(strLength);

        PageInfo<T> pageInfo = service.page(draw, start, length, entity);

        return pageInfo;
    }


}
