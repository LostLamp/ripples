package com.wave.ripples.web.admin.web.interceptor;

import com.wave.ripples.commons.constants.Constants;
import com.wave.ripples.domain.Member;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PermissionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        //获取session中的member
        Member member = (Member) httpServletRequest.getSession().getAttribute(Constants.CACHE_KEY_MEMBER);
        //判断member是否为空，并且返回的视图名是否为login
        if(member != null &&modelAndView != null && modelAndView.getViewName().endsWith("login")){
            //是则重定向回主页
            httpServletResponse.sendRedirect("/main");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
