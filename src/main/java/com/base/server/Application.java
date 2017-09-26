package com.base.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 注册中心，服务发现者
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//两种方式启动
	//	new SpringApplicationBuilder(Application.class).web(true).run(args);
		SpringApplication.run(Application.class, args);
	}
}