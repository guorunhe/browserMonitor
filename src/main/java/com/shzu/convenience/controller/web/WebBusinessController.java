package com.shzu.convenience.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户业务操作控制器
 * @author atom
 */
@Controller
@RequestMapping(value = {"/web/business"})
public class WebBusinessController {


    /**
     * 获取业务列表
     * @return 跳转页
     */
    @RequestMapping(value = {"/get"})
    public String get() {
        return "";
    }
}
