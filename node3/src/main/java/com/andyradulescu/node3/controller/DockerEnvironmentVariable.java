package com.andyradulescu.node3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerEnvironmentVariable {
    @Value("${NUMBER:0}")
    private String number;

    @GetMapping(value = "/docker-env")
    public String getDockerEnvironmentVariable() {
        return number;
    }
}
