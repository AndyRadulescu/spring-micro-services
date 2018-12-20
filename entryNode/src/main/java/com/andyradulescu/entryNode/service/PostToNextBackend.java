package com.andyradulescu.entryNode.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PostToNextBackend {
    public String postToNextBackend(double value) {
        final String uri = "http://node2:8082/number";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, String.valueOf(value), String.class);
    }
}
