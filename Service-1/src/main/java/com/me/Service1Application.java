package com.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@EnableDiscoveryClient

@RestController


public class Service1Application
{

	public static void main(String[] args)
	{
		SpringApplication.run(Service1Application.class, args);
	}
	
	
	
	@GetMapping("/welcome1")
	
	public String welcome()
	{
		return " WELCOME FROM SERVICE 1";
	}

}
