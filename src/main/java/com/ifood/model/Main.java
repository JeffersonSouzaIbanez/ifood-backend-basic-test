package com.ifood.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
	private double temp;
	private long pressure;
	private int humidity;
	private double temp_min;
	private double temp_max;

	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public long getPressure() {
		return pressure;
	}
	public void setPressure(long pressure) {
		this.pressure = pressure;
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
		builder.append("Main [temp=").append(temp);
		builder.append(", pressure=").append(pressure);
		builder.append(", humidity=").append(humidity);
		builder.append(", temp_min=").append(temp_min);
		builder.append(", temp_max=").append(temp_max);
		builder.append("]");
		return builder.toString();
	}
}
