package com.springboot.template.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.template.restapi.model.Coffee;
import com.springboot.template.restapi.model.ConfExternal;
import com.springboot.template.restapi.model.ConfInternal;
import com.springboot.template.restapi.repository.CoffeeRepository;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    private final CoffeeRepository coffeeRepository;
    private final ConfInternal confInternal;
    private final ConfExternal confExternal;

    public CoffeeController(ConfInternal confInternal, ConfExternal confExternal, CoffeeRepository coffeeRepository) {
        this.confInternal = confInternal;
        this.confExternal = confExternal;
        this.coffeeRepository = coffeeRepository;
    }

    @GetMapping("/conf")
    ResponseEntity<ConfInternal> getConfInternal() {
        return new ResponseEntity<>(confInternal, HttpStatus.OK);
    }
    
    @GetMapping("/conf/external")
    ResponseEntity<ConfExternal> getConfExternal() {
        return new ResponseEntity<>(confExternal, HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<Iterable<Coffee>> getCoffees() {
        return new ResponseEntity<>(coffeeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<Optional<Coffee>> getCoffeeById(@PathVariable int id) {
        return new ResponseEntity<>(coffeeRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    ResponseEntity<Coffee> postCoffee(@PathVariable int id, @RequestBody Coffee coffee) {
        return new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<Coffee> putCoffee(@PathVariable int id, @RequestBody Coffee coffee) {
        return (coffeeRepository.existsById(id))
                ? new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.OK)
                : new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus> deleteCoffee(@PathVariable int id) {
        coffeeRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}

