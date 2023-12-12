package com.loanprocessing.customerApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.loanprocessing.customerRepository"})
@EntityScan("com.loanprocessing.entity")
@ComponentScan({"com.loanprocessing.customerController","com.loanprocessing.customer"})

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		System.out.println("SUCCESS");
	}

}
