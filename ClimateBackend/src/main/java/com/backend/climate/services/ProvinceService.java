package com.backend.climate.services;

import java.time.LocalDate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backend.climate.models.Result;
import com.backend.climate.repository.ResultRepository;

@Service
public class ProvinceService {
	@Autowired
	private ResultRepository resultRepository;

	@Value("${api.key}")
	private String apiKey;

	private RestTemplate restTemplate = new RestTemplate();

	public Result getWeatherByProvince(String location) {
		Result res = insertBySpainComunity(location);
		return res;
	}
	
	public Result insertBySpainComunity(String location) {
		Result res = null;
		String address = location + ",ES";
		String date = LocalDate.now().toString();
		if (resultRepository.findByProvinceAndDay(address, date) != null) {
			res = resultRepository.findByProvinceAndDay(address, date);
		} else {
			res = restTemplate
					.getForObject("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/"
							+ address + "?key=" + apiKey, Result.class);
			this.resultRepository.save(res);
		}
		return res;
	}

	public Result getWeatherByProvinceAndDay(String province, String date) {
		Result res = this.resultRepository.findByProvinceAndDay(province, date);
		res.setDays(res.getDays().stream().filter(x->x.getDatetime().equals(date)).collect(Collectors.toList()));
		return res;
	}

}
