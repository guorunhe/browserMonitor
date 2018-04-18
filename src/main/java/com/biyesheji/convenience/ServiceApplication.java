package com.biyesheji.convenience;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 服务启动类
 * @author atom
 */
@EnableTransactionManagement
@SpringBootApplication
public class ServiceApplication {

	/**
	 * 启动类主方法
	 * @param args 参数
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
}
