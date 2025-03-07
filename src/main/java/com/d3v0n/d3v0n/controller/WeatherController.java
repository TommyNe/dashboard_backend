package com.d3v0n.d3v0n.controller;

import com.d3v0n.d3v0n.services.WeatherAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherAPIService weatherAPIService;

    @GetMapping("/api/weather")
    public String getNews() {
        return weatherAPIService.getWeather();
    }
}
