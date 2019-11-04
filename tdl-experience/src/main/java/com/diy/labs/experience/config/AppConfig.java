package com.diy.labs.experience.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;

@Configuration
public class AppConfig {
	
	public @Bean MongoClient mongoClient() {
		return new MongoClient("localhost");
	}

}
