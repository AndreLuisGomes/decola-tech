package com.grupo9.decola_tech;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class DecolaTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecolaTechApplication.class, args);
	}

}
