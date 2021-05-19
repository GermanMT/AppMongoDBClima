package com.backend.climate.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backend.climate.models.Result;
import com.backend.climate.repository.ResultRepository;

@Service
public class ResultService {

	@Autowired
	private ResultRepository resultRepository;

	@Value("${api.key}")
	private String apiKey;

	private RestTemplate restTemplate = new RestTemplate();

	public Result addResult(String day) {
		Result res = restTemplate.getForObject(
				"https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/London,UK/" + day
						+ "?key=" + apiKey,
				Result.class);
		this.resultRepository.save(res);
		return res;
	}

	public List<Result> findByLessThanMaxTemp(Double maxTemp) {
		List<Result> res = resultRepository.findByMaxTemp(maxTemp);
		res.stream().forEach(x -> x.getDays().removeIf(i -> i.getTempmax() > maxTemp));
		return res;
	}

	public List<Result> findByGreaterThanMinTemp(Double minTemp) {
		List<Result> res = resultRepository.findByMinTemp(minTemp);
		res.stream().forEach(x -> x.getDays().removeIf(i -> i.getTempmin() < minTemp));
		return res;

	}

	public List<Result> findBetweenMinTempAndMaxTemp(Double minTemp, Double maxTemp) {
		List<Result> res = resultRepository.findBetweenMinTempAndMaxTemp(maxTemp, minTemp);
		res.stream()
				.forEach(x -> x.getDays().removeIf(i -> (i.getTempmin() < minTemp) || (i.getTempmax() > maxTemp)));
		return res.stream().filter(x -> x.getDays().size() > 0).collect(Collectors.toList());

	}
	
	public List<Result> findByLessThanPrecipProb(Double precipProb) {
		List<Result> res = resultRepository.findByLessThanPrecipProb(precipProb);
		res.stream().forEach(x -> x.getDays().removeIf(i -> i.getPrecipprob() > precipProb));
		return res;
	}
	

	public List<Result> findByGreaterThanPrecipProb(Double precipProb) {
		List<Result> res = resultRepository.findByGreaterThanPrecipProb(precipProb);
		res.stream().forEach(x -> x.getDays().removeIf(i -> i.getPrecipprob() < precipProb));
		return res;

	}
	
	public List<Result> findBetweenMinPrecipProbAndMaxPrecipProb(Double minPrecipProb, Double maxPrecipProb) {
		List<Result> res = resultRepository.findBetweenMinPrecipProbAndMaxPrecipProb(maxPrecipProb, minPrecipProb);
		res.stream()
				.forEach(x -> x.getDays().removeIf(i -> (i.getPrecipprob() < minPrecipProb) || (i.getPrecipprob() > maxPrecipProb)));
		return res.stream().filter(x -> x.getDays().size() > 0).collect(Collectors.toList());

	}
	
	public List<Result> findByPrecipTypeIsRain(String precipType) {
		List<Result> res = resultRepository.findByPrecipTypeIsRain(precipType);
		res.stream().forEach(x -> x.getDays().removeIf(i -> i.getPreciptype() == null));
		res.stream().forEach(x -> x.getDays().removeIf(i -> !(i.getPreciptype().get(0).equals(precipType))));
		return res;

	}
	
	public List<Result> findByLessThanHumidity(Double humidity) {
		List<Result> res = resultRepository.findByLessThanHumidity(humidity);
		res.stream().forEach(x -> x.getDays().removeIf(i -> i.getHumidity() > humidity));
		return res;
	}
	
	public List<Result> findByLessThanCloudCover(Double cloudCover) {
		List<Result> res = resultRepository.findByLessThanCloudCover(cloudCover);
		res.stream().forEach(x -> x.getDays().removeIf(i -> i.getCloudcover() > cloudCover));
		return res;
	}

}
