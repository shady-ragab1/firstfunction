package com.shady.functionpoc.firstfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class FirstfunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstfunctionApplication.class, args);
	}


	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}

}
