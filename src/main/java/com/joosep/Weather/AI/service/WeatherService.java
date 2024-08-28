package com.joosep.Weather.AI.service;

import com.joosep.Weather.AI.config.WeatherConfigProperties;
import org.springframework.web.client.RestClient;

import java.util.function.Function;

/*
   Weather API
   https://www.weatherapi.com/api-explorer.aspx
 */
public class WeatherService implements Function<WeatherService.Request, WeatherService.Response> {

    private final RestClient restClient;
    private final WeatherConfigProperties weatherProps;

    public WeatherService(WeatherConfigProperties props) {
        this.weatherProps = props;
        this.restClient = RestClient.create(weatherProps.apiUrl());
    }

    @Override
    public Response apply(WeatherService.Request weatherRequest) {
        Response response = restClient.get()
                .uri("/current.json?key={key}&q={q}", weatherProps.apiKey(), weatherRequest.city())
                .retrieve()
                .body(Response.class);
        return response;
    }

    public record Request(String city) {}
    public record Response(Location location,Current current) {}
    public record Location(String name, String region, String country, Long lat, Long lon){}
    public record Current(String temp_c, Condition condition, String wind_kph, String humidity) {}
    public record Condition(String text){}

}