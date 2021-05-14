package com.backend.climate.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.backend.climate.repository.ResultRepository;
import com.backend.climate.services.HomeService;

@Configuration
public class MongoDBPopulate {

	@Bean
	CommandLineRunner commandLineRunner(ResultRepository resultRepository, HomeService homeService) {
		return strings -> {
			resultRepository.deleteAll();
			homeService.fillHome();

		};
	}

}
