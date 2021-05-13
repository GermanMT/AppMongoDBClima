package com.backend.climate.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.backend.climate.models.Result;
import com.backend.climate.repository.ResultRepository;

@Service
public class ProvinceService {
	@Autowired
	private ResultRepository resultRepository;

	@Value("${api.key}")
	private String apiKey;

	private static final Map<String, String> PROVINCES = Map.ofEntries(Map.entry("ES-NA", "Navarra,ES"),
			Map.entry("ES-B", "Barcelona,ES"), Map.entry("ES-CS", "Castellón,ES"), Map.entry("ES-ZA", "Zamora,ES"),
			Map.entry("ES-O", "Asturias,ES"), Map.entry("ES-OR", "Orense,ES"), Map.entry("ES-M", "Madrid,ES"),
			Map.entry("ES-L", "Lérida,ES"), Map.entry("ES-J", "Jaén,ES"), Map.entry("ES-H", "Huelva,ES"),
			Map.entry("ES-CU", "Cuenca,ES"), Map.entry("ES-T", "Tarragona,ES"), Map.entry("ES-C", "La Coruña,ES"),
			Map.entry("ES-AV", "'Ávila,ES"), Map.entry("ES-A", "Alicante,ES"), Map.entry("ES-CR", "Ciudad Real,ES"),
			Map.entry("ES-CO", "Córdoba,ES"), Map.entry("ES-VA", "Valladolid,ES"),
			Map.entry("ES-TF", "Santa Cruz de Tenerife,ES"), Map.entry("ES-Z", "Zaragoza,ES"),
			Map.entry("ES-MA", "Málaga,ES"), Map.entry("ES-AL", "Almería,ES"), Map.entry("ES-CE", "Ceuta,ES"),
			Map.entry("ES-PM", "Baleares,ES"), Map.entry("ES-VI", "Álava,ES"), Map.entry("ES-S", "Cantabria,ES"),
			Map.entry("ES-TE", "Teruel,ES"), Map.entry("ES-CC", "Cáceres,ES"), Map.entry("ES-P", "Palencia,ES"),
			Map.entry("ES-PO", "Pontevedra,ES"), Map.entry("ES-GC", "Las Palmas,ES"), Map.entry("ES-GI", "Gerona,ES"),
			Map.entry("ES-TO", "Toledo,ES"), Map.entry("ES-MU", "Murcia,ES"), Map.entry("ES-GR", "Granada,ES"),
			Map.entry("ES-GU", "Guadalajara,ES"), Map.entry("ES-AB", "Albacete,ES"), Map.entry("ES-SO", "Soria,ES"),
			Map.entry("ES-ML", "Melilla,ES"), Map.entry("ES-LU", "Lugo,ES"), Map.entry("ES-SE", "Sevilla,ES"),
			Map.entry("ES-CA", "Cádiz,ES"), Map.entry("ES-SG", "Segovia,ES"), Map.entry("ES-BU", "Burgos,ES"),
			Map.entry("ES-SA", "Salamanca,ES"), Map.entry("ES-V", "Valencia,ES"), Map.entry("ES-LE", "Lérida,ES"),
			Map.entry("ES-BI", "Bizkaia,ES"), Map.entry("ES-HU", "Huesca,ES"), Map.entry("ES-LO", "La Rioja,ES"),
			Map.entry("ES-SS", "Gipuzkoa,ES"), Map.entry("ES-BA", "Badajoz,ES"));

	public Result getWeatherByProvince(String k) {
		String province = PROVINCES.get(k);
		Result res = this.resultRepository.findByProvince(province);
		return res;
	}
	
	public Result getWeatherByProvinceAndDay(String k, String date) {
		String province = PROVINCES.get(k);
		Result res = this.resultRepository.findByProvinceAndDay(province, date);
		res.setDays(res.getDays().stream().filter(x->x.getDatetime().equals(date)).collect(Collectors.toList()));
		return res;
	}

}
