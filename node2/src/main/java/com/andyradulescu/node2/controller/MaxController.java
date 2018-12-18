package com.andyradulescu.node2.controller;

import com.andyradulescu.node2.service.PostMaxNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxController {

    private final  DockerEnvironmentVariable dockerEnv;
    private final PostMaxNumber postRequest;

    @Autowired
    public MaxController(DockerEnvironmentVariable dockerEnv, PostMaxNumber postRequest) {
        this.dockerEnv = dockerEnv;
        this.postRequest = postRequest;
    }

    @PostMapping(value = "/number")
    public String postDummy(@RequestBody String incommedValue) {
        double node1Value = Double.parseDouble(incommedValue);
        double node2Value = Double.parseDouble(dockerEnv.getDockerEnvironmentVariable());
        System.out.println(Math.max(node1Value, node2Value));
        return postRequest.postToOtherBackend(Math.max(node1Value, node2Value));
    }
}
