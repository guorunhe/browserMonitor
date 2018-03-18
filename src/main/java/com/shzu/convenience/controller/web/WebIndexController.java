package com.shzu.convenience.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统首页相关控制器
 * @author atom
 */
@Controller
public class WebIndexController {

    /**
     * 系统首页展示
     * @return 跳转页
     */
    @RequestMapping(value = {"", "/"})
    public String index() {
        return "web/index";
    }
}
