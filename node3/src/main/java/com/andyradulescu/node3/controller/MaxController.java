package com.andyradulescu.node3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxController {

    private final
    DockerEnvironmentVariable dockerEnv;

    @Autowired
    public MaxController(DockerEnvironmentVariable dockerEnv) {
        this.dockerEnv = dockerEnv;
    }

    @PostMapping(value = "/number")
    public double postNumber(@RequestBody String incomeValue) {
        double node1Value = Double.parseDouble(incomeValue);
        double node2Value = Double.parseDouble(dockerEnv.getDockerEnvironmentVariable());
        System.out.println(Math.max(node1Value, node2Value));
        return Math.max(node1Value, node2Value);
    }
}
