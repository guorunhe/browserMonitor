package com.shzu.convenience.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shzu.convenience.constants.PagingConstants;
import com.shzu.convenience.entity.Region;
import com.shzu.convenience.mapper.RegionMapper;
import com.shzu.convenience.service.RegionService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 区域服务接口实现
 * @author atom
 */
@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionMapper regionMapper;
    /**
     * 查询所有的区域信息，根据当前页
     * @return 区域信息
     */
    @Override
    public List<Region> findAllRegion(Integer pageNum) {
        PageHelper.startPage(pageNum, 2);
        List<Region> list = regionMapper.findAllRegion();
        PageInfo<Region> page = new PageInfo(list);
        System.out.println(page.getTotal());
        return list;
    }

    /**
     * 更新区域信息
     * @param region 区域信息
     * @return true/false
     */
    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public boolean updateRegionById(Region region) {
        Integer num = regionMapper.updateRegionById(region);
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 添加区域信息
     * @param region 区域信息
     * @return true/false
     */
    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public boolean addNewRegion(Region region) {
        Integer num = regionMapper.addNewRegion(region);
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }
}
