package com.produto.apirest.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.produto.apirest.resources"})
@EntityScan("{com.produto.apirest.models")

@EnableAutoConfiguration
@Configuration
@ComponentScan(value= "com.produto.apirest")


@ComponentScan(basePackages = {"com.produtos.apirest"})
@EnableJpaRepositories("com.produto.apirest.repository")
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

}
