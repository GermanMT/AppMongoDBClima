package com.backend.climate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.climate.models.Result;
import com.backend.climate.services.ProvinceService;

@CrossOrigin("*")
@RestController
@RequestMapping("/provinces")
public class ProvincesController {

	@Autowired
	private ProvinceService provincesService;

	@GetMapping("/getByProvince/{province}")
	public ResponseEntity<Result> populateHome(@PathVariable String province) {
		try {
			return ResponseEntity.ok(provincesService.getWeatherByProvince(province));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}

	@GetMapping("/getByProvinceAndDay/{province}/{date}")
	public ResponseEntity<Result> populateHome(@PathVariable String province, @PathVariable String date) {
		try {
			return ResponseEntity.ok(provincesService.getWeatherByProvinceAndDay(province, date));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}

}
