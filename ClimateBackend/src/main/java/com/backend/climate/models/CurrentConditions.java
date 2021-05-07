
package com.backend.climate.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CurrentConditions {

    private String datetime;
    private Integer datetimeEpoch;
    private Double temp;
    private Double feelslike;
    private Double humidity;
    private Double dew;
    private Double precip;
    private Object precipprob;
    private Object snow;
    private Double snowdepth;
    private Object preciptype;
    private Double windgust;
    private Double windspeed;
    private Double winddir;
    private Double pressure;
    private Double visibility;
    private Double cloudcover;
    private Object solarradiation;
    private Object solarenergy;
    private Object uvindex;
    private String conditions;
    private String icon;
    private List<String> stations = null;
    private String sunrise;
    private Integer sunriseEpoch;
    private String sunset;
    private Integer sunsetEpoch;
    private Double moonphase;
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

    public Object getPrecipprob() {
        return precipprob;
    }

    public void setPrecipprob(Object precipprob) {
        this.precipprob = precipprob;
    }

    public Object getSnow() {
        return snow;
    }

    public void setSnow(Object snow) {
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

    public Object getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(Object solarradiation) {
        this.solarradiation = solarradiation;
    }

    public Object getSolarenergy() {
        return solarenergy;
    }

    public void setSolarenergy(Object solarenergy) {
        this.solarenergy = solarenergy;
    }

    public Object getUvindex() {
        return uvindex;
    }

    public void setUvindex(Object uvindex) {
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

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunriseEpoch() {
        return sunriseEpoch;
    }

    public void setSunriseEpoch(Integer sunriseEpoch) {
        this.sunriseEpoch = sunriseEpoch;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Integer getSunsetEpoch() {
        return sunsetEpoch;
    }

    public void setSunsetEpoch(Integer sunsetEpoch) {
        this.sunsetEpoch = sunsetEpoch;
    }

    public Double getMoonphase() {
        return moonphase;
    }

    public void setMoonphase(Double moonphase) {
        this.moonphase = moonphase;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
