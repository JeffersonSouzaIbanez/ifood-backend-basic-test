package com.ifood.model;
 import java.util.Arrays;
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 @JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherInfo {
	private Weather[] weather;
	private Main main;
	private long visibility;
	private Wind wind;
	private Clouds clouds;
	private long dt;
	private String name;

	public Weather[] getWeather() {
		return weather;
	}
	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
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
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public long getDt() {
		return dt;
	}
	public void setDt(long dt) {
		this.dt = dt;
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
		builder.append("WeatherInfo [weather=").append(Arrays.toString(weather));
		builder.append(", main=").append(main);
		builder.append(", visibility=").append(visibility);
		builder.append(", wind=").append(wind);
		builder.append(", clouds=").append(clouds);
		builder.append(", dt=").append(dt);
		builder.append(", name=").append(name);
		builder.append("]");
		return builder.toString();
	}
	
 }