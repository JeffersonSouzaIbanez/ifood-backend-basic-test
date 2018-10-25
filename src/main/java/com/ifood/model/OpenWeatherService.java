package com.ifood.model;

public interface OpenWeatherService {
	CityWeather getWeatherByCity(String cityName); 
}
