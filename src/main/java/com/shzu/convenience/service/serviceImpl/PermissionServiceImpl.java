package com.shzu.convenience.service.serviceImpl;

import com.shzu.convenience.entity.Permission;
import com.shzu.convenience.mapper.PermissionMapper;
import com.shzu.convenience.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台权限服务实现
 * @author atom
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> findAllPermission() {
        return permissionMapper.findAllPermission();
    }
}
