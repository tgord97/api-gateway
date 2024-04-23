package com.iprody.aptgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AptGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AptGatewayApplication.class, args);
	}

}
