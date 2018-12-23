package com.wave.ripples.web.admin.web.interceptor;

import com.wave.ripples.commons.constants.Constants;
import com.wave.ripples.domain.Member;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = true;

        HttpSession session = request.getSession();
        Member member = (Member) session.getAttribute(Constants.CACHE_KEY_MEMBER);

        // 尚未登录
        if (member == null) {
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
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
