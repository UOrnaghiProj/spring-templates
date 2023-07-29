package com.springboot.template.mvcmongodb.utility;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.springboot.template.mvcmongodb.model.MongoUser;
import com.springboot.template.mvcmongodb.repository.MongoUserRepository;

import jakarta.annotation.PostConstruct;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataLoader {

    @NonNull
    private final MongoUserRepository mongoUserRepository;

    @PostConstruct
    public void loadData() {
        this.mongoUserRepository.saveAll(List.of(
            new MongoUser(11,999,"Marco0",true),
            new MongoUser(12,9991,"Marco1",true),
            new MongoUser(13,9992,"Marco2",true)
        ));
    } 

    @Scheduled(fixedRate = 10000)
    public void scheduleFixedRateTask() {

        WebClient
            .create("https://jsonplaceholder.typicode.com/todos/1")
            .get()
            .retrieve()
            .bodyToFlux(MongoUser.class)
            .toStream()
            .forEach(mongoUserRepository::save);

    } 
}
