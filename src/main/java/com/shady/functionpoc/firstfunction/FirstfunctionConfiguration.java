package com.shady.functionpoc.firstfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class FirstfunctionConfiguration {

	@Bean
	public Function<String, String> uppercase() {
		return value -> {
			return value.toUpperCase();
		};
	}
}
