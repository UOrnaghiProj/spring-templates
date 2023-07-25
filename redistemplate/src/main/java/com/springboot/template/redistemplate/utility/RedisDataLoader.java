package com.springboot.template.redistemplate.utility;

import org.springframework.stereotype.Component;

import com.springboot.template.redistemplate.model.RedisUser;
import com.springboot.template.redistemplate.repository.RedisUserRepository;

import jakarta.annotation.PostConstruct;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class RedisDataLoader {
    
    @NonNull
    RedisUserRepository redisUserRepository;

    @PostConstruct
    private void loadData() {
        redisUserRepository.save(new RedisUser(1, 10, "Doe", true));
        redisUserRepository.save(new RedisUser(2, 15, "John", true));
    }

}
