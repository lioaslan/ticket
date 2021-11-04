package com.crossaz.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@DubboComponentScan(basePackages = {"com.crossaz.common.rmi"})
public class TicketApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TicketApplication.class, args);
	}

}
