package com.wecare.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WeCareConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeCareConfigServerApplication.class, args);
	}
}
