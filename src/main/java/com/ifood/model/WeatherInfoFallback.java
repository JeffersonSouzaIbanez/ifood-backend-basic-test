package com.ifood.model;

import java.io.Serializable;

/**
 * WeatherInfoFallback class
 *
 * @author Jefferson Ibanez
 */
public class WeatherInfoFallback extends WeatherInfo implements Serializable {

    private static final long serialVersionUID = 3407259358323005142L;

    private String fallbackMessage;

    public String getFallbackMessage() {
        return fallbackMessage;
    }

    public void setFallbackMessage(String fallbackMessage) {
        this.fallbackMessage = fallbackMessage;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("WeatherInfoFallBack [fallbackMessage=").append(fallbackMessage).append("]");
        return builder.toString();
    }
}
