package com.codref.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DeliveryEurekaServerApplication {

	public static void main(String[] args) {
		//delivery-eureka-server.yml
		//  http://localhost:9091/
		SpringApplication.run(DeliveryEurekaServerApplication.class, args);
	}

}
