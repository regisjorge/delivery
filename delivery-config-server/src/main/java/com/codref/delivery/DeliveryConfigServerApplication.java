package com.codref.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DeliveryConfigServerApplication {

	public static void main(String[] args) {
		//delivery-sample-config.yml
		//   http://localhost:9090/delivery-sample-config/default
		SpringApplication.run(DeliveryConfigServerApplication.class, args);
	}

}
