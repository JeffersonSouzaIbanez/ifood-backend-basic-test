package com.ifood.model;

import com.google.gson.annotations.SerializedName;

public class WeatherProperties {
	@SerializedName("temp")
	private double temperature;
	private long pressure;
	private int humidity;
	@SerializedName("temp_min")
	private double minimumTemperature;
	@SerializedName("temp_max")
	private double maximumTemperature;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
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

	public double getMinimumTemperature() {
		return minimumTemperature;
	}

	public void setMinimumTemperature(double temp_min) {
		this.minimumTemperature = temp_min;
	}

	public double getMaximumTemperature() {
		return maximumTemperature;
	}

	public void setMaximumTemperature(double temp_max) {
		this.maximumTemperature = temp_max;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WeatherProperties [temperature=").append(temperature);
		builder.append(", pressure=").append(temperature);
		builder.append(", humidity=").append(humidity);
		builder.append(", minimumTemperature=").append(minimumTemperature);
		builder.append(", maximumTemperature=").append(maximumTemperature);
		builder.append("]");
		return builder.toString();
	}
}