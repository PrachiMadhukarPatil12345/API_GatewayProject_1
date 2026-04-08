package com.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication

@EnableAdminServer

public class AdminServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(AdminServer2Application.class, args);
	}

}
