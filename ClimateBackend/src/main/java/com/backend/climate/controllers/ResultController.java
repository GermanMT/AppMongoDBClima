package com.backend.climate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
