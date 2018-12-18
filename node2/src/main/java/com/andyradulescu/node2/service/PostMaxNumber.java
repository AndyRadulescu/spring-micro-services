package com.andyradulescu.node2.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PostMaxNumber {
    public String postToOtherBackend(double value) {
        final String uri = "http://localhost:8083/number";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, String.valueOf(value), String.class);
    }

}
