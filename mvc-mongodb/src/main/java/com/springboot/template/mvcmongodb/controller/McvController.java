package com.springboot.template.mvcmongodb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.template.mvcmongodb.repository.MongoUserRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class McvController {

    @NonNull
    private final MongoUserRepository mongoUserRepository;

        @GetMapping("/")
    public String showWelcomePage() {
        return "welcome";
    }
    
    @GetMapping("/showusers")
    public String showUsers(Model model) {
        model.addAttribute("users", mongoUserRepository.findAll());
        return "showusers";
    } 

    
}
