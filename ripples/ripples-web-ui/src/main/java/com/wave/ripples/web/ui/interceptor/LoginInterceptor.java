package com.wave.ripples.web.ui.interceptor;


import com.wave.ripples.domain.Member;
import com.wave.ripples.web.ui.constants.SystemConstants;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = true;

        HttpSession session = request.getSession();
        Member user = (Member) session.getAttribute(SystemConstants.CHEK_KEY_MEMBER);

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

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
