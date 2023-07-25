package com.springboot.template.redistemplate.service;

import org.springframework.stereotype.Service;

import com.springboot.template.redistemplate.model.RedisUser;
import com.springboot.template.redistemplate.repository.RedisUserRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RedisService {

    @NonNull
    RedisUserRepository redisUserRepository;

    public Iterable<RedisUser> getUtenti() {
        return redisUserRepository.findAll();
    }
    
}
