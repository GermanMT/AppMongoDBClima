package com.backend.climate.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Filter {

	private Double maxTemp;

	private Double minTemp;

	private Double precipProbMax;

	private Double precipProbMin;

	private String precipType;
	
	private Double humidityMax;
	
	private Double cloudCover;

}
