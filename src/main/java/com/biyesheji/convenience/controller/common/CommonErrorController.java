package com.biyesheji.convenience.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 错误页面配置
 * @author atom
 */
@Controller
@RequestMapping(value = {"/error"})
public class CommonErrorController {

    /**
     * 404页面
     * @return 跳转页
     */
    @RequestMapping(value = {"/404"})
    public String error404() {
        return "error/404";
    }

    /**
     * 500页面
     * @return 跳转页
     */
    @RequestMapping(value = {"/500"})
    public String error500() {
        return "error/500";
    }
}
