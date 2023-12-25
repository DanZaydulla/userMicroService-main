package com.userMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UserMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMicroServiceApplication.class, args);
	}

}
