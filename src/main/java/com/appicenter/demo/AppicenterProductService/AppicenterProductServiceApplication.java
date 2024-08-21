package com.appicenter.demo.AppicenterProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppicenterProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppicenterProductServiceApplication.class, args);
	}

}
