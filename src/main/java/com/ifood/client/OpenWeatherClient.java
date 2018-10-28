package com.ifood.client;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.ifood.model.WeatherInfo;

import feign.Param;
import feign.RequestLine;

/**
 * OpenWeatherClient interface using Feign
 *
 * @author Jefferson Ibanez
 */
@FeignClient(name = "weatherClient")
public interface OpenWeatherClient {
    @RequestLine("GET /weather?q={cityName}&APPID={appKeyId}")
    WeatherInfo getWeatherInfo(@Param(value = "cityName") String cityName, @Param(value = "appKeyId") String appIdKey);
}