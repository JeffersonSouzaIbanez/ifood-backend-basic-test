package com.ifood.client;


import org.springframework.stereotype.Component;

import com.ifood.model.WeatherInfo;

@Component
public class OpenWeatherClientFallBack implements OpenWeatherClient{

	@Override
	public WeatherInfo getWeatherInfo(String cityName, String appID) {
		return new WeatherInfo();
	}

}
