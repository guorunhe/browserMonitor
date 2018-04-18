package com.biyesheji.convenience;

import com.biyesheji.convenience.entity.ProcessVo;
import com.biyesheji.convenience.entity.SigarInfoEntity;
import com.biyesheji.convenience.utility.sigar.SigarUtils;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.cmd.Ps;

import java.net.UnknownHostException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SigarTest {
    public static void main(String[] args) {

        // Sigar信息集合
//        List<SigarInfoEntity> sigarInfos = new ArrayList<SigarInfoEntity>();
//        try {
            // 1.获取系统信息和jvm虚拟机信息
//            sigarInfos.addAll(SigarUtils.getJvmInfos());
            // 2.获取cpu信息
//            sigarInfos.addAll(SigarUtils.getCpuInfos());
//            // 3.获取内存信息
//            sigarInfos.addAll(SigarUtils.getMemoryInfos());
//            // 4.获取操作系统信息
//            sigarInfos.addAll(SigarUtils.getOsInfos());
//            // 5.获取文件信息
//            sigarInfos.addAll(SigarUtils.getFileInfos());
//            // 6.获取网络信息
//            sigarInfos.addAll(SigarUtils.getNetInfos());

//            StringBuffer sigarStringBuffer = new StringBuffer();
//            for (SigarInfoEntity sigarInfo : sigarInfos) {
//                sigarStringBuffer.append(sigarInfo.getName()).append(":").append(sigarInfo.getValue()).append("\r\n");
//            }
//
//            System.out.println(sigarStringBuffer.toString());
//
//
//        } catch (SigarException se) {
//            // TODO: handle exception
//            se.printStackTrace();
//        }

        List<ProcessVo> processVos = SigarUtils.getProcessInfo();
//        System.out.println(processVos.toString());

//        DateTimeFormatter parser2 = ISODateTimeForm.dateTimeNoMillis();
//
//        String jtdate = "2010-01-01T12:00:00+01:00";
//        System.out.println(parser2.parseDateTime(jtdate));



    }


}
