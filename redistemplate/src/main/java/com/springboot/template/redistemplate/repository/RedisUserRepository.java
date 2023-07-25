package com.springboot.template.redistemplate.repository;

import org.springframework.data.repository.CrudRepository;
import com.springboot.template.redistemplate.model.RedisUser;

public interface RedisUserRepository extends CrudRepository<RedisUser,Integer> {}
