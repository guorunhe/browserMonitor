package com.shzu.convenience.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 * @author atom
 */
public class LoginStatusInterceptor implements HandlerInterceptor {
    /**
     * 到达Controller之前执行
     * @param httpServletRequest 请求
     * @param httpServletResponse 返回
     * @param o 对象
     * @return boolean
     * @throws Exception 异常
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return false;
    }

    /**
     * Controller处理之后,视图渲染之前
     * @param httpServletRequest 请求
     * @param httpServletResponse 返回
     * @param o 对象
     * @param modelAndView 视图
     * @throws Exception 异常
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * Controller处理 与 视图渲染之后
     * @param httpServletRequest 请求
     * @param httpServletResponse 返回
     * @param o 对象
     * @param e 异常
     * @throws Exception 异常
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
