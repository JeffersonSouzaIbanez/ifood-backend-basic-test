package com.ifood.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifood.client.WeatherClient;
import com.ifood.model.CityWeather;
import com.ifood.model.OpenWeatherService;

@Service
public class OpenWeatherServiceImpl implements OpenWeatherService{

	@Autowired
	WeatherClient weatherClient;

	@Override
	public CityWeather getWeatherByCity(String cityName) {
		return weatherClient.getWeatherInfo(cityName, "56b43c17bff04ff04ce4fc381bf540fe");
	}
}
