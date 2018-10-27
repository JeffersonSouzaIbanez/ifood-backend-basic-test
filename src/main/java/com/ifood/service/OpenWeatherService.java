package com.ifood.service;

import com.ifood.model.WeatherInfo;

public interface OpenWeatherService {
	WeatherInfo getWeatherByCity(String cityName); 
}
