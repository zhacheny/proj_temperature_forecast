package com.io.zhach.proj_temperature_forecast.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Currently {

    @SerializedName("apparentTemperature")
    @Expose
    private Double apparentTemperature;
    @SerializedName("cloudCover")
    @Expose
    private Double cloudCover;
    @SerializedName("dewPoint")
    @Expose
    private Double dewPoint;
    @SerializedName("humidity")
    @Expose
    private Double humidity;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("nearestStormBearing")
    @Expose
    private Integer nearestStormBearing;
    @SerializedName("nearestStormDistance")
    @Expose
    private Integer nearestStormDistance;
    @SerializedName("ozone")
    @Expose
    private Double ozone;
    @SerializedName("precipIntensity")
    @Expose
    private Double precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private Double precipProbability;
    @SerializedName("pressure")
    @Expose
    private Double pressure;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("temperature")
    @Expose
    private Double temperature;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("visibility")
    @Expose
    private Double visibility;
    @SerializedName("windBearing")
    @Expose
    private Integer windBearing;
    @SerializedName("windSpeed")
    @Expose
    private Double windSpeed;

    public Double getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(Double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public Double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(Double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public Double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(Double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getNearestStormBearing() {
        return nearestStormBearing;
    }

    public void setNearestStormBearing(Integer nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    public Integer getNearestStormDistance() {
        return nearestStormDistance;
    }

    public void setNearestStormDistance(Integer nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public Double getOzone() {
        return ozone;
    }

    public void setOzone(Double ozone) {
        this.ozone = ozone;
    }

    public Double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Double precipProbability) {
        this.precipProbability = precipProbability;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Integer getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(Integer windBearing) {
        this.windBearing = windBearing;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

}