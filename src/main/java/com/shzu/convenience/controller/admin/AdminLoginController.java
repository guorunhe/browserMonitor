package com.shzu.convenience.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 后台登陆控制器
 * @author atom
 */
@Controller
@RequestMapping(value = {"/admin/login"})
public class AdminLoginController {

    /**
     * 登录页面展示
     * @return 跳转页
     */
    @RequestMapping(value = {"", "/"})
    public String login() {
        return "web/login";
    }

    /**
     * 登录接口
     * @param account 账号
     * @param password 密码
     * @return 跳转页
     */
    @RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    public String add(@RequestParam String account, @RequestParam String password) {

        return "web/main";
    }

    /**
     * 退出接口
     * @return 跳转页
     */
    @RequestMapping(value = {"/delete"})
    public String delete() {
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "";
    }
}
