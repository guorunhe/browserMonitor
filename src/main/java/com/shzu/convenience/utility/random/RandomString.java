package com.shzu.convenience.utility.random;

import java.util.UUID;

/**
 * 随机串
 * @author atom
 */
public class RandomString {

    /**
     * 获取32位长度随机字符串
     * @return String
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 获取8位长度的随机字符串
     * @return String
     */
    public static String getTenBitsRandomString() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 10);
    }

}
