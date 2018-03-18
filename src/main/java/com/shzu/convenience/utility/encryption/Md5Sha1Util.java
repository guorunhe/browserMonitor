package com.shzu.convenience.utility.encryption;

import java.security.MessageDigest;

/**
 * MD5/SHA1 加密
 * @author atom
 */
public class Md5Sha1Util {

    /**
     * 16进制内容
     */
    private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    /**
     * MD5加密
     * @param str 需要加密的字符串
     * @return 加密结果
     */
    public static String md5Encryption(String str) {
        return encode("md5", str);
    }

    /**
     * SHA1加密
     * @param str 需要加密的字符串
     * @return 加密结果
     */
    public static String sha1Encryption(String str) {
        return encode("sha1", str);
    }

    /**
     *
     * @param algorithm 加密类型
     * @param value 需要加密的字符串
     * @return 加密结果
     */
    private static String encode(String algorithm, String value) {
        if (value == null) {
            return null;
        }
        try {
            MessageDigest messageDigest
                    = MessageDigest.getInstance(algorithm);
            messageDigest.update(value.getBytes());
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 二进制转16进制
     * @param bytes 二进制数组
     * @return 字符串
     */
    private static String getFormattedText(byte[] bytes) {
        int len = bytes.length;
        StringBuilder buf = new StringBuilder(len * 2);
        for (int j = 0; j < len; j++) {
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return buf.toString();
    }

}
