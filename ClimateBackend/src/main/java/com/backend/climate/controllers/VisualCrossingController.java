package com.backend.climate.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class VisualCrossingController {

    @Value("${api.key}")
    private String apiKey;

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/climateInfo/{location}")
    public String getInfoByLocation(@PathVariable(value = "location") String location){
        String info = restTemplate.getForObject("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + location + "?key=" + apiKey, String.class);
        return info;
    }

    @GetMapping("/")
    public String getInfo(){
        String info = restTemplate.getForObject("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/España?key=" + apiKey, String.class);
        return info;
    }
}