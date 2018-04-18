package com.biyesheji.convenience.service.serviceImpl;

import com.biyesheji.convenience.entity.SigarInfoEntity;
import com.biyesheji.convenience.mapper.SigarMapper;
import com.biyesheji.convenience.service.SigarService;
import com.biyesheji.convenience.utility.sigar.SigarUtils;
import org.hyperic.sigar.SigarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 业务服务接口实现
 * @author atom
 */
@Service
public class SigarServiceImpl implements SigarService {
    @Autowired
    private SigarMapper sigarMapper;

    /**
     * 添加cpu使用情况记录.
     * @return
     * @throws SigarException
     */
    @Override
    public Boolean insertCpuUse() throws SigarException{
        List<SigarInfoEntity> cpuUseList = SigarUtils.getCpuUse();
        for (SigarInfoEntity s : cpuUseList) {
            sigarMapper.insert(s.getValue(), s.getName());
        }
        return true;
    }

    /**
     * 查询cpu使用情况.
     * @return
     * @throws SigarException
     */
    @Override
    public HashMap getCpuInfo() throws SigarException {
        Integer bmCpuCount = sigarMapper.getBmCpuCount();
        if (bmCpuCount / 4 > 8) {
            List<Integer> ids = sigarMapper.getBmCpuFirst4();
            System.out.println(ids.toString());
            sigarMapper.deleteCpuInfo(ids);
        }
        this.insertCpuUse();
        List<Integer> cpuIds = sigarMapper.getCpuIds();
        HashMap cpuInfo = new HashMap();
        List<HashMap<String, String>> db_cpuInfo = new ArrayList<>();
        List<Object> cpuUse = null;
        List<Object> cpuUses = new ArrayList<>();

        List<HashMap> cpuInfos = new ArrayList<>();
        for (Integer cpuId : cpuIds) {
            cpuUse = new ArrayList<>();
            db_cpuInfo = sigarMapper.getCpuInfo(cpuId);
            for (HashMap h : db_cpuInfo) {
                cpuUse.add(h.get("cpu_use"));
            }
            Collections.reverse(cpuUse);
            cpuUses.add(cpuUse);
        }
        List<String> time = new ArrayList<>();
        for (HashMap h : db_cpuInfo) {
            time.add(h.get("created").toString());
        }
        Collections.reverse(time);
        cpuInfo.put("time", time);
        cpuInfo.put("cpuUse", cpuUses);
        return cpuInfo;
    }

    /**
     * 获取服务器当前内存使用情况.
     * @return
     * @throws SigarException
     */
    @Override
    public Map<String, Object> getMem() throws SigarException {
        return SigarUtils.getMem();
    }

    /**
     * 获取chrome浏览器当前运行情况.
     * @return
     */
    @Override
    public List<HashMap<String, String>> getBrowseRunInfo() {
        List<HashMap<String, String>> sigarMapperUseMem = sigarMapper.getUseMem();
        Collections.reverse(sigarMapperUseMem);
        return sigarMapperUseMem;
    }

    /**
     * 获取chrome当前运行情况并写入数据库.
     * @return
     */
    @Override
    public Integer insertBrowseRunInfo() {
        Double totalUseMem = SigarUtils.getBmTotalUseMem();
        Integer res = sigarMapper.insertBmUseMem(totalUseMem);
        return res;
    }

    @Override
    public String getBmStartTime() {
        return SigarUtils.getStartTime();
    }

}
