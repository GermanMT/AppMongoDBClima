
package com.backend.climate.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Result")
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private Integer queryCost;
    private Double latitude;
    private Double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private Double tzoffset;
    private String description;
    private List<Day> days = null;
    private List<Object> alerts = null;
    private Stations stations;
    private CurrentConditions currentConditions;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
