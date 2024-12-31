package com.d3v0n.d3v0n.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherAPIService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?lat=52.79210&lon=7.322290&lang=de&units=metric&appid=acbdff4eb21fbfdec9b60501b0d0cb46";

    public String getWeather() {
        return restTemplate.getForObject(BASE_URL, String.class);
    }
}
