package com.shzu.convenience.mapper;

import com.shzu.convenience.entity.Region;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 区域操作
 * @author atom
 */
@Mapper
public interface RegionMapper {

    /**
     * 获取所有的区域信息
     * @return List
     */
    List<Region> findAllRegion();

    /**
     * 添加新的区域
     * @param region 区域信息
     * @return 受影响行数
     */
    Integer addNewRegion(@Param("region") Region region);

    /**
     * 更新区域信息
     * @param region 区域信息
     * @return 受影响行数
     */
    Integer updateRegionById(@Param("region") Region region);
}
