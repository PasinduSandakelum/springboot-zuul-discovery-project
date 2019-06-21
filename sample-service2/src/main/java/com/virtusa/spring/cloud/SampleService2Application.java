package com.virtusa.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SampleService2Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleService2Application.class, args);
	}

}
