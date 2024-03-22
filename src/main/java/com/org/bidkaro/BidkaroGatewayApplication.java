package com.org.bidkaro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BidkaroGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BidkaroGatewayApplication.class, args);
	}

}
