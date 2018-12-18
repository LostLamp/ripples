package com.wave.ripples.web.ui.interceptor;

import com.wave.ripples.web.ui.entity.TbMember;
import com.wave.ripples.web.ui.utils.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PermissionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        TbMember tbMember = (TbMember) request.getSession().getAttribute("tbMember");
        if(tbMember!=null){
            response.sendRedirect("main");
            return false;
        }else {
            return true;
        }

    }
}
