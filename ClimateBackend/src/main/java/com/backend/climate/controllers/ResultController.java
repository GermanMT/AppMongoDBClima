package com.backend.climate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.climate.models.Filter;
import com.backend.climate.models.Result;
import com.backend.climate.services.ResultService;




@CrossOrigin("*")
@RestController
@RequestMapping("/results")
public class ResultController {
	
	@Autowired
	private ResultService resultService;
	
	@GetMapping("/getWeatherByDay")
	public ResponseEntity<Result> findNotRevised(@RequestParam String day) {
		try {
			return ResponseEntity.ok(resultService.addResult(day));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@GetMapping("/findByLessThanMaxTemp")
	public ResponseEntity<List<Result>> findByLessThanMaxTemp(@RequestBody Filter filter) {
		try {
			return ResponseEntity.ok(resultService.findByLessThanMaxTemp(filter.getMaxTemp()));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@GetMapping("/findByGreaterThanMinTemp")
	public ResponseEntity<List<Result>> findByGreaterThanMinTemp(@RequestBody Filter filter) {
		try {
			return ResponseEntity.ok(resultService.findByGreaterThanMinTemp(filter.getMinTemp()));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@GetMapping("/findBetweenMaxTempAndMinTemp")
	public ResponseEntity<List<Result>> findBetweenMaxTempAndMinTemp(@RequestBody Filter filter) {
		try {
			return ResponseEntity.ok(resultService.findBetweenMinTempAndMaxTemp(filter.getMinTemp(), filter.getMaxTemp()));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@GetMapping("/findByLessThanPrecipProb")
	public ResponseEntity<List<Result>> findByLessThanPrecipProb(@RequestBody Filter filter) {
		try {
			return ResponseEntity.ok(resultService.findByLessThanPrecipProb(filter.getPrecipProbMax()));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@GetMapping("/findByGreaterThanPrecipProb")
	public ResponseEntity<List<Result>> findByGreaterThanPrecipProb(@RequestBody Filter filter) {
		try {
			return ResponseEntity.ok(resultService.findByGreaterThanPrecipProb(filter.getPrecipProbMin()));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}

	@GetMapping("/findBetweenMaxPrecipProbAndMinPrecipProb")
	public ResponseEntity<List<Result>> findBetweenMaxPrecipProbAndMinPrecipProb(@RequestBody Filter filter) {
		try {
			return ResponseEntity.ok(resultService.findBetweenMinTempAndMaxTemp(filter.getPrecipProbMin(), filter.getPrecipProbMax()));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	

	@GetMapping("/findByPrecipTypeIsRain")
	public ResponseEntity<List<Result>> findByPrecipTypeIsRain(@RequestBody Filter filter) {
		try {
			return ResponseEntity.ok(resultService.findByPrecipTypeIsRain(filter.getPrecipType()));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@GetMapping("/findByLessThanHumidity")
	public ResponseEntity<List<Result>> findByLessThanHumidity(@RequestBody Filter filter) {
		try {
			return ResponseEntity.ok(resultService.findByLessThanHumidity(filter.getHumidityMax()));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@GetMapping("/findByLessThanCloudCover")
	public ResponseEntity<List<Result>> findByLessThanCloudCover(@RequestBody Filter filter) {
		try {
			return ResponseEntity.ok(resultService.findByLessThanCloudCover(filter.getCloudCover()));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
}
