package com.epam.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(
            @RequestParam(required = false, defaultValue = "World") String name) {
        return ResponseEntity.ok("Hello " + name);
    }

}
