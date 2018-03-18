package com.shzu.convenience.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 后台角色控制器
 * @author atom
 */
@Controller
@RequestMapping(value = {"/admin/role"})
public class AdminRoleController {

    /**
     * 添加角色
     * @param name 名称
     * @param description 描述
     * @param pid 权限id
     * @return 跳转页
     */
    @RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    public String add(@RequestParam String name, @RequestParam String description, @RequestParam String[] pid) {
        return "";
    }

    /**
     * 删除角色
     * @param rid 编号
     * @return 跳转页
     */
    @RequestMapping(value = {"/delete"})
    public String delete(@RequestParam String rid) {
        return "";
    }

    /**
     * 更新角色
     * @param name 名称
     * @param description 描述
     * @param pid 权限id
     * @return 跳转页
     */
    @RequestMapping(value = {"/update"})
    public String update(@RequestParam String name, @RequestParam String description, @RequestParam String[] pid) {
        return "";
    }

    /**
     * 获取所有的角色信息
     * @return 跳转页
     */
    @RequestMapping(value = {"/all"})
    public String all() {
        return "";
    }
}
