package com.springboot.template.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import com.springboot.template.restapi.model.ConfExternal;


@SpringBootApplication
@ConfigurationPropertiesScan
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	@Bean
    @ConfigurationProperties(prefix = "conf.ext")
    public ConfExternal getConfExternal() {
        return new ConfExternal();
    }

}
