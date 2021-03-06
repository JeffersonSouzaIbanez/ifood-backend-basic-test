package com.ifood.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ifood.client.OpenWeatherClient;
import com.ifood.client.OpenWeatherClientFallbackFactory;
import com.ifood.error.decoder.WeatherErrorDecoder;
import com.ifood.model.WeatherInfo;
import com.ifood.service.OpenWeatherService;

import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.hystrix.HystrixFeign;
import feign.slf4j.Slf4jLogger;

/**
 * OpenWeatherServiceImpl class
 *
 * @author Jefferson Ibanez
 */
@Service
public class OpenWeatherServiceImpl implements OpenWeatherService {
    @Value( "${app.key.id}" )
    private String appKeyId;

    @Override
    @Cacheable("cityWeather")
    public WeatherInfo getWeatherByCity(String cityName) {
        OpenWeatherClient openWeatherClient = createHystrixFeign();
        return openWeatherClient.getWeatherInfo(cityName, appKeyId);
    }

    private OpenWeatherClient createHystrixFeign() {
        return HystrixFeign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .errorDecoder(new WeatherErrorDecoder())
                .logger(new Slf4jLogger(OpenWeatherClient.class))
                .logLevel(Logger.Level.BASIC)
                .target(OpenWeatherClient.class, "http://api.openweathermap.org/data/2.5/", new OpenWeatherClientFallbackFactory());
    }
}
