package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tcs"})
public class Azure9pmMarch9PrjApplication {

	public static void main(String[] args) {
		SpringApplication.run(Azure9pmMarch9PrjApplication.class, args);
	}

}
