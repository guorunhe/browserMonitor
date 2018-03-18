package com.shzu.convenience.controller.admin;

import com.shzu.convenience.entity.Permission;
import com.shzu.convenience.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 后台权限模块控制器
 * @author atom
 */
@Controller
@RequestMapping("/admin/permission")
public class AdminPermissionController {
    @Autowired
    private PermissionService permissionService;

    /**
     * 添加权限
     * @param name 名称
     * @param url 链接地址
     * @param description 描述
     * @return 跳转页
     */
    @RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    public String add(@RequestParam String name, @RequestParam String url, @RequestParam String description) {
        return "";
    }

    /**
     * 删除权限
     * @param id 编号
     * @return 跳转页
     */
    @RequestMapping(value = {"/delete"})
    public String delete(@RequestParam String id) {
        return "";
    }

    /**
     * 修改权限
     * @param name 名称
     * @param url 链接地址
     * @param description 描述
     * @return 跳转页
     */
    @RequestMapping(value = {"/update"})
    public String update(@RequestParam String name, @RequestParam String url, @RequestParam String description) {
        return "";
    }

    /**
     * 获取全部的权限信息
     * @return 跳转页
     */
    @RequestMapping(value = {"/all"})
    public String all() {
        List<Permission> list = permissionService.findAllPermission();
        for (Permission per: list) {
            System.out.println(per.getName());
        }
        return "";
    }
}
