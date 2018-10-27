package com.ifood.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ifood.client.OpenWeatherClient;
import com.ifood.model.WeatherInfo;
import com.ifood.service.OpenWeatherService;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.slf4j.Slf4jLogger;

@Service
public class OpenWeatherServiceImpl implements OpenWeatherService {

	@Override
	@Cacheable("cityWeather")
	public WeatherInfo getWeatherByCity(String cityName) {
		OpenWeatherClient openWeatherClient = Feign.builder().encoder(new GsonEncoder()).decoder(new GsonDecoder())
				.logger(new Slf4jLogger(OpenWeatherClient.class)).logLevel(Logger.Level.FULL)
				.target(OpenWeatherClient.class, "http://api.openweathermap.org/data/2.5/");

		return openWeatherClient.getWeatherInfo(cityName, "56b43c17bff04ff04ce4fc381bf540fe");
	}
}
