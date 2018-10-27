package com.ifood;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ifood.controllers.WeatherController;
import com.ifood.model.CurrentWeather;
import com.ifood.model.WeatherInfo;
import com.ifood.model.WeatherProperties;
import com.ifood.model.Wind;
import com.ifood.service.OpenWeatherService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = WeatherController.class, secure = false)
public class WeatherControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private OpenWeatherService openWeatherService;

	private static final String EXPECTED_JSON = "{\"currentWeather\":[{\"weatherGroup\":\"Clouds\",\"description\":\"broken clouds\"}],\"weatherProperties\":{\"temperature\":282.15,\"pressure\":0,\"humidity\":81,\"minimumTemperature\":280.15,\"maximumTemperature\":283.15},\"visibility\":0,\"wind\":{\"speed\":2.6},\"epochTime\":1540503000,\"name\":\"Paris\"}";

	@Test
	public void retrieveWeatherInfo() throws Exception {

		Mockito.when(openWeatherService.getWeatherByCity(Mockito.anyString())).thenReturn(createMockWeatherInfo());
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/weather/Paris")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String response = result.getResponse().getContentAsString();
		assertEquals(EXPECTED_JSON, response);

	}

	private static WeatherInfo createMockWeatherInfo() {
		WeatherInfo weatherInfo = new WeatherInfo();
		CurrentWeather currentWeather = new CurrentWeather();
		currentWeather.setWeatherGroup("Clouds");
		currentWeather.setDescription("broken clouds");
		CurrentWeather[] currentWeatherArray = new CurrentWeather[] { currentWeather };
		weatherInfo.setCurrentWeather(currentWeatherArray);
		WeatherProperties weatherProperties = new WeatherProperties();
		weatherProperties.setTemperature(282.15);
		weatherProperties.setHumidity(81);
		weatherProperties.setMinimumTemperature(280.15);
		weatherProperties.setMaximumTemperature(283.15);
		weatherInfo.setWeatherProperties(weatherProperties);
		Wind wind = new Wind();
		wind.setSpeed(2.6);
		weatherInfo.setWind(wind);
		weatherInfo.setEpochTime(1540503000);
		weatherInfo.setName("Paris");
		return weatherInfo;
	}
}
