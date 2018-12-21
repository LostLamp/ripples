package com.wave.ripples.web.admin.web.interceptor;

import com.wave.ripples.commons.constants.SystemConstants;
import com.wave.ripples.domain.Member;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 /**
  * 权限管理拦截器
  *
  * @Author wodef
  * @version 1.0.0
  * @Date 2018/12/19
  */
public class PermissionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Member user = (Member) request.getSession().getAttribute(SystemConstants.CACHE_KEY_MEMBER);
        // 已登录
        if (user != null) {
            response.sendRedirect("/main");
            return false;
        }

        // 返回登录页
        else {
            return true;
        }
    }

     @Override
     public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

     }

     @Override
     public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

     }
 }
