
package com.backend.climate.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Hour {

    private String datetime;
    private Integer datetimeEpoch;
    private Double temp;
    private Double feelslike;
    private Double humidity;
    private Double dew;
    private Double precip;
    private Double precipprob;
    private Double snow;
    private Double snowdepth;
    private Object preciptype;
    private Double windgust;
    private Double windspeed;
    private Double winddir;
    private Double pressure;
    private Double visibility;
    private Double cloudcover;
    private Double solarradiation;
    private Double solarenergy;
    private Double uvindex;
    private String conditions;
    private String icon;
    private Object stations;
    private String source;
    private Double severerisk;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Integer getDatetimeEpoch() {
        return datetimeEpoch;
    }

    public void setDatetimeEpoch(Integer datetimeEpoch) {
        this.datetimeEpoch = datetimeEpoch;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Double feelslike) {
        this.feelslike = feelslike;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getDew() {
        return dew;
    }

    public void setDew(Double dew) {
        this.dew = dew;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Double getPrecipprob() {
        return precipprob;
    }

    public void setPrecipprob(Double precipprob) {
        this.precipprob = precipprob;
    }

    public Double getSnow() {
        return snow;
    }

    public void setSnow(Double snow) {
        this.snow = snow;
    }

    public Double getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(Double snowdepth) {
        this.snowdepth = snowdepth;
    }

    public Object getPreciptype() {
        return preciptype;
    }

    public void setPreciptype(Object preciptype) {
        this.preciptype = preciptype;
    }

    public Double getWindgust() {
        return windgust;
    }

    public void setWindgust(Double windgust) {
        this.windgust = windgust;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public Double getWinddir() {
        return winddir;
    }

    public void setWinddir(Double winddir) {
        this.winddir = winddir;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Double getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(Double solarradiation) {
        this.solarradiation = solarradiation;
    }

    public Double getSolarenergy() {
        return solarenergy;
    }

    public void setSolarenergy(Double solarenergy) {
        this.solarenergy = solarenergy;
    }

    public Double getUvindex() {
        return uvindex;
    }

    public void setUvindex(Double uvindex) {
        this.uvindex = uvindex;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Object getStations() {
        return stations;
    }

    public void setStations(Object stations) {
        this.stations = stations;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Double getSevererisk() {
        return severerisk;
    }

    public void setSevererisk(Double severerisk) {
        this.severerisk = severerisk;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
