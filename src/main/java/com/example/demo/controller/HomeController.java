package com.example.demo.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity home() {
        return ResponseEntity.ok(Map.of("message", "rest home"));
    }

    @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity index() {
        return ResponseEntity.ok(new ClassPathResource("static/index.html"));
    }

    @GetMapping("/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok(Map.of("message", "rest hello"));
    }

}
