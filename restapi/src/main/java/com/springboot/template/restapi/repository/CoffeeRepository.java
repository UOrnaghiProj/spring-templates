package com.springboot.template.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import com.springboot.template.restapi.model.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee,Integer> {}
