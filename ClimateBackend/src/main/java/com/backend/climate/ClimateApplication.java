package com.backend.climate;

import com.backend.climate.models.Climate;
import com.backend.climate.repository.ClimateRepository;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication()
public class ClimateApplication implements CommandLineRunner {

	@Autowired
	ClimateRepository climateRepository;

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(ClimateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (Arrays.asList(environment.getActiveProfiles()).contains("dev")) {
			loadSampleData();
	 	}
	}

	private void loadSampleData() {
		climateRepository.deleteAll();

		Climate climate = new Climate("Soleado");

		climateRepository.save(climate);

		Long climates = climateRepository.count();
		System.out.println(climates + " created climates");
	}
}
