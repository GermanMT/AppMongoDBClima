package com.backend.climate.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backend.climate.models.Result;
import com.backend.climate.repository.ResultRepository;

import lombok.AllArgsConstructor;


@Service
public class ResultService {
	
	@Autowired
	private ResultRepository resultRepository;
	
	@Value("${api.key}")
    private String apiKey;

    private RestTemplate restTemplate = new RestTemplate();
	
	
	public Result addResult(String day) {
		Result res = restTemplate.getForObject("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/London,UK/" + day + "?key=" + apiKey, Result.class);    
		this.resultRepository.save(res);
		return res;
	}

}
