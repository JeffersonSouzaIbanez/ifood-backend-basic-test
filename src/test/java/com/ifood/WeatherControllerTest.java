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
import com.ifood.model.TempInfo;
import com.ifood.model.OpenWeatherService;
import com.ifood.model.Weather;
import com.ifood.model.WeatherInfo;
import com.ifood.model.Wind;

@RunWith(SpringRunner.class)
@WebMvcTest(value = WeatherController.class, secure = false)
public class WeatherControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private OpenWeatherService openWeatherService;
	
	private static final String EXPECTED_JSON = "{\"weather\":[{\"main\":\"Clouds\"}],\"main\":{\"temp\":282.15,\"humidity\":81,\"temp_min\":280.15,\"temp_max\":283.15},\"wind\":{\"speed\":2.6,\"deg\":340},\"dt\":1540503000,\"name\":\"Paris\"}";

	@Test
	public void retrieveWeatherInfo() throws Exception {
		
		Mockito.when(openWeatherService.getWeatherByCity(Mockito.anyString())).thenReturn(createMockWeatherInfo());
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/weather/Paris").accept(MediaType.APPLICATION_JSON);
		MvcResult result= mockMvc.perform(requestBuilder).andReturn();
		String response = result.getResponse().getContentAsString();
		assertEquals(EXPECTED_JSON, response);
		
	}
	
	private static WeatherInfo createMockWeatherInfo() {
		WeatherInfo weatherInfo = new WeatherInfo();
		Weather weather = new Weather();
		weather.setCurretnWeather("Clouds");
		Weather[] weatherArray = new Weather[] { weather };
		weatherInfo.setWeather(weatherArray);
		TempInfo main = new TempInfo();
		main.setTemp(282.15);
		main.setHumidity(81);
		main.setTemp_min(280.15);
		main.setTemp_max(283.15);
		weatherInfo.setTempInfo(main);
		Wind wind = new Wind();
		wind.setSpeed(2.6);
		wind.setDeg(340);
		weatherInfo.setWind(wind);
		weatherInfo.setDt(1540503000);
		weatherInfo.setName("Paris");
		return weatherInfo;
	}
}
