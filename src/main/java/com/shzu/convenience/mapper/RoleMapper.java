package com.shzu.convenience.mapper;

import com.shzu.convenience.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 角色管理相关操作
 * @author atom
 */
@Mapper
public interface RoleMapper {
    /**
     * 添加角色,返回角色id
     * @param role 角色实体类
     * @return 受影响行数
     */
    Integer addRole(@Param("role") Role role);

    /**
     * 更新角色
     * @param role 角色实体类
     * @return 受影响行数
     */
    Integer updateRoleById(@Param("role") Role role);

    /**
     * 删除角色
     * @param id 角色id
     * @return 受影响行数
     */
    Integer deleteRoleById(@Param("id") Integer id);
}
