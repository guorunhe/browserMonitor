package com.shzu.convenience.utility.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * 邮件发送类
 * @author atom
 */
public class EmailUtil {
    @Autowired
    private static JavaMailSender mailSender;

    /**
     * 发送人
     */
    @Value("${spring.mail.username}")
    private static String sender;

    /**
     * 发送简单的文本邮件
     * @param recipient 收件人
     * @param password 新密码
     */
    public static void sendSimpleEmail(String recipient, String password) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sender);
        message.setTo(recipient);
        message.setSubject("主题：新密码");
        message.setText("新密码为：" + password);
        mailSender.send(message);
    }
}
