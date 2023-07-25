package com.springboot.template.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.template.restapi.model.Father;
import com.springboot.template.restapi.model.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final Greeting greeting;
    private final Father father;

    public GreetingController(Greeting greeting, Father father) {
        this.greeting = greeting;
        this.father = father;
    }

    @GetMapping
    public ResponseEntity<String> getGreeting() {
        return new ResponseEntity<>(greeting.getName(), HttpStatus.OK);
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcome() {
        return new ResponseEntity<>(greeting.getMessage(), HttpStatus.OK);
    }

    @GetMapping("/father")
    public ResponseEntity<String> getFather() {
        return new ResponseEntity<>(father.getDescription(), HttpStatus.OK);
    }
    
}

