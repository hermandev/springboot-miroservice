package id.codecorn.dapertement.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DapertementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DapertementServiceApplication.class, args);
	}

}
