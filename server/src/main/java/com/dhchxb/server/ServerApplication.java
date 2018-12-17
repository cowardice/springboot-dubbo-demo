package com.dhchxb.server;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.dhchxb.server.service")
public class ServerApplication{

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

