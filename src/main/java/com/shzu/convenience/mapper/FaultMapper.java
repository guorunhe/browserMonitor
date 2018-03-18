package com.shzu.convenience.mapper;

import com.shzu.convenience.entity.Fault;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 故障相关操作
 * @author atom
 */
@Mapper
public interface FaultMapper {

    /**
     * 查找所有的故障信息
     * @return List
     */
    List<Fault> findAllFault();

    /**
     * 添加新的故障信息
     * @param fault 故障
     * @return 受影响数量
     */
    Integer addNewFault(@Param("fault") Fault fault);

    /**
     * 更新故障信息
     * @param fault 故障
     * @return 受影响数量
     */
    Integer updateFaultById(@Param("fault") Fault fault);
}
