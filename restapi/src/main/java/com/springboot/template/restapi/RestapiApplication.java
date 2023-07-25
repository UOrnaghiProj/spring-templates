package com.springboot.template.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

import com.springboot.template.restapi.model.Father;

@SpringBootApplication
@ConfigurationPropertiesScan
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	@Bean
    @ConfigurationProperties(prefix = "father")
    public Father getFather() {
        return new Father();
    }

}
