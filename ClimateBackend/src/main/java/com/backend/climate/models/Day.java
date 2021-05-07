
package com.backend.climate.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Day {

    private String datetime;
    private Integer datetimeEpoch;
    private Double tempmax;
    private Double tempmin;
    private Double temp;
    private Double feelslikemax;
    private Double feelslikemin;
    private Double feelslike;
    private Double dew;
    private Double humidity;
    private Double precip;
    private Double precipprob;
    private Object precipcover;
    private Object preciptype;
    private Double snow;
    private Double snowdepth;
    private Double windgust;
    private Double windspeed;
    private Double winddir;
    private Double pressure;
    private Double cloudcover;
    private Double visibility;
    private Double solarradiation;
    private Double solarenergy;
    private Double uvindex;
    private Double severerisk;
    private String sunrise;
    private Integer sunriseEpoch;
    private String sunset;
    private Integer sunsetEpoch;
    private Double moonphase;
    private String conditions;
    private String description;
    private String icon;
    private Object stations;
    private String source;
    private List<Hour> hours = null;
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

    public Double getTempmax() {
        return tempmax;
    }

    public void setTempmax(Double tempmax) {
        this.tempmax = tempmax;
    }

    public Double getTempmin() {
        return tempmin;
    }

    public void setTempmin(Double tempmin) {
        this.tempmin = tempmin;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelslikemax() {
        return feelslikemax;
    }

    public void setFeelslikemax(Double feelslikemax) {
        this.feelslikemax = feelslikemax;
    }

    public Double getFeelslikemin() {
        return feelslikemin;
    }

    public void setFeelslikemin(Double feelslikemin) {
        this.feelslikemin = feelslikemin;
    }

    public Double getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Double feelslike) {
        this.feelslike = feelslike;
    }

    public Double getDew() {
        return dew;
    }

    public void setDew(Double dew) {
        this.dew = dew;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
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

    public Object getPrecipcover() {
        return precipcover;
    }

    public void setPrecipcover(Object precipcover) {
        this.precipcover = precipcover;
    }

    public Object getPreciptype() {
        return preciptype;
    }

    public void setPreciptype(Object preciptype) {
        this.preciptype = preciptype;
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

    public Double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
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

    public Double getSevererisk() {
        return severerisk;
    }

    public void setSevererisk(Double severerisk) {
        this.severerisk = severerisk;
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

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<Hour> getHours() {
        return hours;
    }

    public void setHours(List<Hour> hours) {
        this.hours = hours;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
