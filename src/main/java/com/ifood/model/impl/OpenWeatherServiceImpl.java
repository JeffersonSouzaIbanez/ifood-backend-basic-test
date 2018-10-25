package com.ifood.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifood.client.OpenWeatherClient;
import com.ifood.model.WeatherInfo;
import com.ifood.model.OpenWeatherService;

@Service
public class OpenWeatherServiceImpl implements OpenWeatherService{

	@Autowired
	OpenWeatherClient openWeatherClient;

	@Override
	public WeatherInfo getWeatherByCity(String cityName) {
		return openWeatherClient.getWeatherInfo(cityName, "56b43c17bff04ff04ce4fc381bf540fe");
	}
}
