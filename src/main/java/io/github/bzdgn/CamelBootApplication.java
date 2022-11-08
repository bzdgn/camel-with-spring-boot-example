package io.github.bzdgn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class CamelBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(CamelBootApplication.class, args);
	}
}
