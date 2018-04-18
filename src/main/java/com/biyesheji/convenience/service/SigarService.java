package com.biyesheji.convenience.service;

import org.hyperic.sigar.SigarException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 业务表服务接口
 * @author atom
 */
public interface SigarService {
    Boolean insertCpuUse() throws SigarException;

    HashMap getCpuInfo()throws SigarException;

    Map<String, Object> getMem() throws SigarException;

    List<HashMap<String, String>> getBrowseRunInfo();

    Integer insertBrowseRunInfo();

    String getBmStartTime();
}
