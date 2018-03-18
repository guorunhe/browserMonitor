package com.shzu.convenience.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 管理后台业务控制器
 * @author atom
 */
@Controller
@RequestMapping(value = {"/admin/business"})
public class AdminBusinessController {

    /**
     * 所有的业务信息
     * @return 跳转页
     */
    @RequestMapping(value = {"/all"})
    public String all() {
        return "";
    }
}
