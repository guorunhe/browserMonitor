package com.shzu.convenience.service;


import com.shzu.convenience.entity.Permission;

import java.util.List;

/**
 * 后台权限服务
 * @author atom
 */
public interface PermissionService {

    /**
     * 查询所有的权限
     * @return List
     */
    List<Permission> findAllPermission();

}
