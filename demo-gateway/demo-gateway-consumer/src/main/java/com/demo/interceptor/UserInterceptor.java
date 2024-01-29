package com.demo.interceptor;

import cn.z.util.UserInfo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * <h1>用户拦截器</h1>
 *
 * <p>
 * createDate 2023/12/20 11:07:17
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
public class UserInterceptor implements HandlerInterceptor {

    /**
     * preHandle
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param handler  Object
     * @return 是否放行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        UserInfo.setId(Long.parseLong(request.getHeader("user-id")));
        return true;
    }

    /**
     * postHandle
     *
     * @param request      HttpServletRequest
     * @param response     HttpServletResponse
     * @param handler      Object
     * @param modelAndView ModelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        UserInfo.removeId();
    }

}
