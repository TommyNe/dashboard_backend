package com.d3v0n.d3v0n.controller;

import com.d3v0n.d3v0n.services.NewsAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @Autowired
    private NewsAPIService newsAPIService;

    @GetMapping("/api/news")
    public String getNews() {
        return newsAPIService.getNews();
    }
}
