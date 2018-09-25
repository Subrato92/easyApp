package com.easykolkata.utility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.easykolkata.*")
@EnableJpaRepositories(basePackages="com.easykolkata.repositories.*")
@EntityScan("com.easykolkata.models.*")
public class FoundationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoundationApplication.class, args);
	}
}
