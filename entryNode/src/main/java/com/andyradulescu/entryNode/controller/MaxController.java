package com.andyradulescu.entryNode.controller;

import com.andyradulescu.entryNode.service.PostToNextBackend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxController {

    private final PostToNextBackend post;

    @Autowired
    public MaxController(PostToNextBackend post) {
        this.post = post;
    }

    @GetMapping(value = "/number/{value}")
    public String getFirstNumberInput(@PathVariable String value) {
        System.out.println(value);
        return post.postToNextBackend(Double.parseDouble(value));
    }

}
