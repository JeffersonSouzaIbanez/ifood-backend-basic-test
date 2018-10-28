package com.ifood.service;

import com.ifood.model.WeatherInfo;

/**
 * OpenWeatherService interface
 *
 * @author Jefferson Ibanez
 */
public interface OpenWeatherService {
    WeatherInfo getWeatherByCity(String cityName);
}
