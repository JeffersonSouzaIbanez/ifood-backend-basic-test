package com.ifood.client;


import org.springframework.cloud.netflix.feign.FeignClient;

import com.ifood.model.WeatherInfo;

import feign.Param;
import feign.RequestLine;

@FeignClient(name="weatherClient")
public interface OpenWeatherClient {
	@RequestLine("GET /weather?q={cityName}&APPID={appID}")
	WeatherInfo getWeatherInfo(@Param(value="cityName") String cityName, @Param(value="appID") String appID);
}