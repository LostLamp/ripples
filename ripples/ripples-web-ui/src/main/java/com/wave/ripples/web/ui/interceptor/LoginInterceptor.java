package com.wave.ripples.web.ui.interceptor;


import com.wave.ripples.web.ui.entity.TbMember;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = true;

        HttpSession session = request.getSession();
        TbMember user = (TbMember) session.getAttribute("tbMember");

        // 尚未登录
        if (user == null) {
            response.sendRedirect("/login");
            flag = false;
        }

        // 已登录
        else {
            flag = true;
        }

        return flag;
    }
}
