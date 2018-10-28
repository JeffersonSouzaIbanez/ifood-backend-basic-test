package com.ifood.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * WeatherProperties class
 *
 * @author Jefferson Ibanez
 */
public class WeatherProperties implements Serializable {

    private static final long serialVersionUID = 7800455209786049081L;

    @SerializedName("temp")
    private double temperature;

    private double pressure;

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

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
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