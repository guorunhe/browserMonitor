package com.shzu.convenience.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 角色权限连接表相关操作
 * @author atom
 */
@Mapper
public interface RolePermissionAccessMapper {

    /**
     * 删除某权限相关的记录
     * @param pid 权限id
     * @return 受影响行数
     */
    Integer deleteByPid(@Param("pid") Integer pid);

    /**
     * 插入角色与权限对应关系记录
     * @param rid 角色id
     * @param pid 权限id
     * @return 受影响行数
     */
    Integer addRolePermissionAccess(@Param("rid") Integer rid, @Param("pid") Integer pid);
}
