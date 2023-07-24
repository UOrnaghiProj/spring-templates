package com.springboot.template.restapi.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "greeting")
public class Greeting {

    private String name;
    private String message;

}