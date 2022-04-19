package com.github.rafaeldcfarias.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/logger")
public class LogController {

    @GetMapping("/")
    public void logarGetRequest(HttpEntity<String> request) {
        log.info("Request: " + request.toString());
        log.info("Headers: " + request.getHeaders());
        log.info("Body: " + request.getBody());
    }

}
