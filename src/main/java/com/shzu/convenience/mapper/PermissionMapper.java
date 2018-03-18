package com.shzu.convenience.mapper;

import com.shzu.convenience.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 权限管理相关操作
 * @author atom
 */
@Mapper
public interface PermissionMapper {
    /**
     * 权限添加功能
     * @param permission 权限实体类
     * @return 受影响行数
     */
    Integer addPermission(@Param("permission") Permission permission);

    /**
     * 权限删除功能
     * @param id 权限id
     * @return 受影响行数
     */
    Integer deletePermission(@Param("id") Integer id);

    /**
     * 修改权限功能
     * @param permission 权限实体类
     * @return 受影响行数
     */
    Integer updatePermissionById(@Param("Permission") Permission permission);

    /**
     * 查询所有的权限
     * @return 返回所有的权限
     */
    List<Permission> findAllPermission();
}
