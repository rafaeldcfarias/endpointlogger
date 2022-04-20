package com.github.rafaeldcfarias.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j(topic = "request")
@RestController
@RequestMapping("/logger")
public class LogController {

    @GetMapping("/")
    public void logarGetRequest(HttpEntity<String> request) {
        log.info("Get Request: " + request.toString());
        log.info("Headers: " + request.getHeaders());
        log.info("Body: " + request.getBody());
    }

    @PostMapping("/")
    public void logarPostRequest(HttpEntity<String> request) {
        log.info("Post Request: " + request.toString());
        log.info("Headers: " + request.getHeaders());
        log.info("Body: " + request.getBody());
    }

    @PutMapping("/")
    public void logarPutRequest(HttpEntity<String> request) {
        log.info("Put Request: " + request.toString());
        log.info("Headers: " + request.getHeaders());
        log.info("Body: " + request.getBody());
    }

}
