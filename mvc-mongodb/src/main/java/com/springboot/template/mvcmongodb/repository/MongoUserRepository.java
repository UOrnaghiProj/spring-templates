package com.springboot.template.mvcmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.springboot.template.mvcmongodb.model.MongoUser;

public interface MongoUserRepository extends MongoRepository<MongoUser,Integer> {}
