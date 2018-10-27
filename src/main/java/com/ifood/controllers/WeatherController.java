package com.ifood.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ifood.model.Coord;
import com.ifood.model.OpenWeatherService;
import com.ifood.model.WeatherInfo;

@RestController
@RequestMapping(path = "/weather")
public class WeatherController {
	@Autowired
    private OpenWeatherService openWeatherService;
	
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{cityName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public WeatherInfo get(@PathVariable(value = "cityName") String cityName){
    	return openWeatherService.getWeatherByCity(cityName);
    }

}
