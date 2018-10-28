package com.ifood.error.decoder;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;

/**
 * WeatherErrorDecoder class 
 * Used in manual creation of a feign client
 *
 * @author Jefferson Ibanez
 */
public class WeatherErrorDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoderDefault = new ErrorDecoder.Default();

    @Override
    public Exception decode(String methodSignature, Response response) {
        HttpHeaders responseHttpHeaders = new HttpHeaders();
        response.headers().entrySet().stream()
                .forEach(entry -> responseHttpHeaders.put(entry.getKey(), new ArrayList<>(entry.getValue())));

        HttpStatus statusCode = HttpStatus.valueOf(response.status());
        String statusText = response.reason();

        byte[] responseBody = null;
        try {
            if (response.body() != null) {
                responseBody = Util.toByteArray(response.body().asInputStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to process response body.", e);
        }

        if (response.status() >= 400 && response.status() <= 499) {
            return new HttpClientErrorException(statusCode, statusText, responseHttpHeaders, responseBody, null);
        }

        if (response.status() >= 500 && response.status() <= 599) {
            return new HttpServerErrorException(statusCode, statusText, responseHttpHeaders, responseBody, null);
        }
        return errorDecoderDefault.decode(methodSignature, response);
    }
}
