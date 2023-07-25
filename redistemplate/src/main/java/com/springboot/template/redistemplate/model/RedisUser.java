package com.springboot.template.redistemplate.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash
@JsonIgnoreProperties(ignoreUnknown = true)
public class RedisUser {

    @Id
    private Integer id;
    private Integer userId;
    private String title;
    // You can use JsonProprty to map the value of the field to the name of the field
    @JsonProperty("completed")
    private Boolean completed;
    // You can use JsonIgnore to ignore the field

}
