package com.ifood.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ifood.model.WeatherInfo;
import com.ifood.model.WeatherInfoFallback;

import feign.hystrix.FallbackFactory;

/**
 * OpenWeatherClientFallbackFactory class.
 *
 * The method {@link OpenWeatherClientFallbackFactory#create(Throwable)} will be
 * called when problem occurs in the {@link OpenWeatherClient#getWeatherInfo(String, String)}
 *
 * @author Jefferson Ibanez
 */
public class OpenWeatherClientFallbackFactory implements FallbackFactory<OpenWeatherClient> {
    private static final Logger LOGGER = LoggerFactory.getLogger(OpenWeatherClientFallbackFactory.class);

    @Override
    public OpenWeatherClient create(Throwable cause) {
        return new OpenWeatherClient() {

            @Override
            public WeatherInfo getWeatherInfo(String cityName, String appID) {
                OpenWeatherClientFallbackFactory.LOGGER.info("Fallback, cause: {}", cause.getMessage());
                WeatherInfoFallback weatherInfoFallback = new WeatherInfoFallback();
                weatherInfoFallback.setFallbackMessage(cause.getMessage());
                return weatherInfoFallback;
            }
        };
    }
}
