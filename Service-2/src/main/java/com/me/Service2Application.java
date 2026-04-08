package com.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@EnableDiscoveryClient

@RestController

public class Service2Application
{

	public static void main(String[] args)
	{
		SpringApplication.run(Service2Application.class, args);
	}
	
     
	@GetMapping("/welcome2")
	
	public String welcome()
	{
		return " WELCOME FROM SERVICE 2";
	}
	
	
@GetMapping("/abc/greet")
	
	public String greet()
	{
		return " GREET FROM SERVICE 2";
	}

@GetMapping("/abc/Hii")

public String Hii()
{
	return " Hiii FROM SERVICE 2";
}

}


