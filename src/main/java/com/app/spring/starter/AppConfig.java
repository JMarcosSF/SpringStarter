package com.app.spring.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.spring.starter.kitchen.Kitchen;

@Configuration
public class AppConfig {
	
//	@Bean(name="helloBean")
    public Kitchen helloWorld() {
        return new Kitchen();
    }
	
}