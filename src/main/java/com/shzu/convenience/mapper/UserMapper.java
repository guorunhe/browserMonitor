package com.shzu.convenience.mapper;

import com.shzu.convenience.entity.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户管理相关操作
 * @author atom
 */
@Mapper
public interface UserMapper {

    /**
     * 查看所有的用户
     * @return 返回所有的用户
     */
    List<UserVo> findAllUser();
}
