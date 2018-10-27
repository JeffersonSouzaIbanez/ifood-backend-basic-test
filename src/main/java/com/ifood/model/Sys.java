package com.ifood.model;
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 @JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {
	private int type;
	private int id;
	private double message;
	private String country;
	private long sunrise;
	private long sunset;
 	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMessage() {
		return message;
	}
	public void setMessage(double message) {
		this.message = message;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getSunrise() {
		return sunrise;
	}
	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}
	public long getSunset() {
		return sunset;
	}
	public void setSunset(long sunset) {
		this.sunset = sunset;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sys [type=").append(type);
		builder.append(", id=").append(id);
		builder.append(", message=").append(message);
		builder.append(", country=").append(country);
		builder.append(", sunrise=").append(sunrise);
		builder.append(", sunset=").append(sunset);
		builder.append("]");
		return builder.toString();
	}
 }