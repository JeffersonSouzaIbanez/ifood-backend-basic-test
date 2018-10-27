package com.ifood.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TempInfo {
	private double temp;
	private int humidity;
	private double temp_min;
	private double temp_max;

	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TempInfo [temp=");
		builder.append(temp);
		builder.append(", humidity=");
		builder.append(humidity);
		builder.append(", temp_min=");
		builder.append(temp_min);
		builder.append(", temp_max=");
		builder.append(temp_max);
		builder.append("]");
		return builder.toString();
	}
}