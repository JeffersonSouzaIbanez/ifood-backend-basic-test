package com.ifood.model;

import java.io.Serializable;
import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class WeatherInfo implements Serializable{

	@SerializedName("weather")
	private CurrentWeather[] currentWeather;
	@SerializedName("main")
	private WeatherProperties weatherProperties;
	private long visibility;
	private Wind wind;
	@SerializedName("dt")
	private long epochTime;
	private String name;

	public CurrentWeather[] getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(CurrentWeather[] weather) {
		this.currentWeather = weather;
	}

	public WeatherProperties getWeatherProperties() {
		return weatherProperties;
	}

	public void setWeatherProperties(WeatherProperties weatherProperties) {
		this.weatherProperties = weatherProperties;
	}

	public long getVisibility() {
		return visibility;
	}

	public void setVisibility(long visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public long getEpochTime() {
		return epochTime;
	}

	public void setEpochTime(long epochTime) {
		this.epochTime = epochTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WeatherInfo [currentWeather=").append(Arrays.toString(currentWeather));
		builder.append(", weatherProperties=").append(weatherProperties);
		builder.append(", visibility=").append(visibility);
		builder.append(", wind=").append(wind);
		builder.append(", epochTime=").append(epochTime);
		builder.append(", name=").append(name);
		builder.append("]");
		return builder.toString();
	}
}