package com.andyradulescu.node3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerEnvironmentVariable {
    @Value("${DOCKER_ENV_VARIABLE:0}")
    private String docker_env_variable;

    @GetMapping(value = "/docker-env")
    public String getDockerEnvironmentVariable() {
        return docker_env_variable;
    }
}
