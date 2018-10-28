package com.ifood.error.decoder;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.ifood.controllers.WeatherController;

import feign.Request;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;

/**
 * Junit test for {@link WeatherErrorDecoder} class
 *
 * @author Jefferson Ibanez
 */
@RunWith(SpringRunner.class)
public class WeatherErrorDecoderTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    private ErrorDecoder errorDecoder = new WeatherErrorDecoder();

    private Map<String, Collection<String>> headers = new LinkedHashMap<>();

    private static final String URL = "http://localhost:8081/weather/London";
    private static final String METHOD = "OpenWeatherClient#getWeatherInfo(String,String)";

    @Test
    public void throwsHttpServerErrorException() throws Throwable {
        thrown.expect(HttpServerErrorException.class);
        thrown.expectMessage("500 Internal Server Error");

        Response response = Response.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .reason(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                .request(Request.create(RequestMethod.GET.name(), URL, Collections.emptyMap(), null, Util.UTF_8))
                .headers(headers)
                .build();

        throw errorDecoder.decode(METHOD, response);
    }

    @Test
    public void throwsHttpClientErrorException() throws Throwable {
        thrown.expect(HttpClientErrorException.class);
        thrown.expectMessage("404 Not Found");

        Response response = Response.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .reason(HttpStatus.NOT_FOUND.getReasonPhrase())
                .request(Request.create(RequestMethod.GET.name(), URL, Collections.emptyMap(), null, Util.UTF_8))
                .headers(headers)
                .build();

        throw errorDecoder.decode(METHOD, response);
    }

}
