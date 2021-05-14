package com.backend.climate.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backend.climate.models.Result;
import com.backend.climate.repository.ResultRepository;

@Service
public class HomeService {

	@Autowired
	private ResultRepository resultRepository;

	@Value("${api.key}")
	private String apiKey;

	private RestTemplate restTemplate = new RestTemplate();

	private static final List<String> PROVINCES = List.of("Álava", "Albacete", "Alicante", "Almería", "Asturias",
			"Ávila", "Badajoz", "Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real",
			"Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcoa", "Huelva", "Huesca", "Islas Baleares", "Jaén",
			"La Coruña", "La Rioja", "Las Palmas", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra",
			"Orense", "Palencia", "Pontevedra", "Salamanca", "Santa Cruz de Tenerife", "Segovia", "Sevilla", "Soria",
			"Tarragona", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza");

	public List<Result> fillHome() {
		List<Result> list = new ArrayList<Result>();
		for (String province : PROVINCES) {
			list.add(insertBySpainProvince(province));
		}
		return list;
	}

	public Result insertBySpainProvince(String location) {
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

}
