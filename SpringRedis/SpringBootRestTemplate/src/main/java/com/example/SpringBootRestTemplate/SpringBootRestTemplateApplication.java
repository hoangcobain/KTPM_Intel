package com.example.SpringBootRestTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootRestTemplateApplication {
	private static final String URL_PRODUCT = "http://localhost:8671/get-for-object";

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();

//		SpringApplication.run(SpringBootRestTemplateApplication.class, args);
		String result = restTemplate.getForObject(URL_PRODUCT,String.class);
		System.out.println(result);

	}

}
