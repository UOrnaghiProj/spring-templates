package com.springboot.template.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.template.restapi.model.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final Greeting greeting;

    public GreetingController(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping
    public ResponseEntity<String> getGreeting() {
        return new ResponseEntity<>(greeting.getName(), HttpStatus.OK);
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcome() {
        return new ResponseEntity<>(greeting.getMessage(), HttpStatus.OK);
    }
    
}

