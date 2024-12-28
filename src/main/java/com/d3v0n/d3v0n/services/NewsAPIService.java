package com.d3v0n.d3v0n.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsAPIService {

    @Autowired
    private RestTemplate restTemplate;

    private static  final String BASE_URL = "https://www.tagesschau.de/api2u/news/?regions=9&ressort=inland";

    public String getNews() {
        return restTemplate.getForObject(BASE_URL, String.class);
    }
}
