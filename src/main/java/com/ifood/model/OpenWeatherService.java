package com.ifood.model;

public interface OpenWeatherService {
	WeatherInfo getWeatherByCity(String cityName); 
}
