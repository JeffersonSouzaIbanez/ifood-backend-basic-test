package com.ifood.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityWeather {
	private Coord coord;
	private Weather[] weather;
	private String base;
	private Main main;
	private long visibility;
	private Wind wind;
	private Clouds clouds;
	private long dt;
	private Sys sys;
	private int id;
	private String name;
	private int cod;

	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public Weather[] getWeather() {
		return weather;
	}
	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
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
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CityWeather [coord=").append(coord);
		builder.append(", weather=").append(Arrays.toString(weather));
		builder.append(", base=").append(base);
		builder.append(", main=").append(main);
		builder.append(", visibility=").append(visibility);
		builder.append(", wind=").append(wind);
		builder.append(", clouds=").append(clouds);
		builder.append(", dt=").append(dt);
		builder.append(", sys=").append(sys);
		builder.append(", id=").append(id);
		builder.append(", name=").append(name);
		builder.append(", cod=").append(cod);
		builder.append("]");
		return builder.toString();
	}
	

}
