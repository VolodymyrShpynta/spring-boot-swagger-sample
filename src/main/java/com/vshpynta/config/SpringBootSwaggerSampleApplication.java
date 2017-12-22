package com.vshpynta.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vshpynta"})
@Import(SwaggerConfiguration.class)
public class SpringBootSwaggerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerSampleApplication.class, args);
	}
}
