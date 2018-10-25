package com.ifood.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ifood.model.CityWeather;

@FeignClient(url="http://api.openweathermap.org/data/2.5/", name="weatherClient")
public interface WeatherClient {
	@RequestMapping(path = "/weather", method = RequestMethod.GET)
	CityWeather getWeatherInfo(@RequestParam("q") String cityName, @RequestParam("APPID") String appIDKey);
}
