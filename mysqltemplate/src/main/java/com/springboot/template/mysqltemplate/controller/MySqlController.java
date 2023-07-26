package com.springboot.template.mysqltemplate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.template.mysqltemplate.model.MySqlUser;
import com.springboot.template.mysqltemplate.repository.MySqlUserRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mysql")
public class MySqlController {

    @NonNull
    MySqlUserRepository mySqlUserRepository;

    @GetMapping("/users")
    public ResponseEntity<Iterable<MySqlUser>> getUsers() {
        return ResponseEntity.ok(mySqlUserRepository.findAll());
    }

}
