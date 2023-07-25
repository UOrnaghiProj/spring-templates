package com.springboot.template.redistemplate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.template.redistemplate.model.RedisUser;
import com.springboot.template.redistemplate.service.RedisService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/redis")
@RequiredArgsConstructor
public class RedisController {

    @NonNull
    RedisService redisService;

    @GetMapping("/utenti")
    public ResponseEntity<Iterable<RedisUser>> getUtenti() {
        return new ResponseEntity<>(redisService.getUtenti(), HttpStatus.OK);
    }
    
}
