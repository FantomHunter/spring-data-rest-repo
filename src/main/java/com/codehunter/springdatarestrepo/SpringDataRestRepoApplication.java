package com.codehunter.springdatarestrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringDataRestRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestRepoApplication.class, args);
	}

}
