package com.shzu.convenience.service;

import com.shzu.convenience.entity.Region;

import java.util.List;

/**
 * 区域服务接口
 * @author atom
 */
public interface RegionService {
    /**
     * 查询所有的区域信息
     * @return 区域信息列表
     */
    List<Region> findAllRegion(Integer pageNum);

    /**
     * 根据id更新数据
     * @param region 区域信息
     * @return boolean
     */
    boolean updateRegionById(Region region);

    /**
     * 创建
     * @param region 区域信息
     * @return boolean
     */
    boolean addNewRegion(Region region);
}
