package com.andyradulescu.node2.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PostMaxNumber {
    public String postToOtherBackend(double value) {
//        URI uri = fromUriString("maxbetween3numbers3-backends_node3_1://node2:8083").path("/number").build().toUri();
        final String uri = "http://node3:8083/number";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, String.valueOf(value), String.class);
    }

}
