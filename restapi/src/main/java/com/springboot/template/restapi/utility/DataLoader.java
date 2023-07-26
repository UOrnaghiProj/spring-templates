package com.springboot.template.restapi.utility;

import java.util.List;
import org.springframework.stereotype.Component;
import com.springboot.template.restapi.model.Coffee;
import com.springboot.template.restapi.repository.CoffeeRepository;
import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

        private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    private void loadData() {
        this.coffeeRepository.saveAll(List.of(
            new Coffee(0,"Cappuccino", "Espresso, steamed milk and foam"),
            new Coffee(1,"Latte", "Espresso, steamed milk and steamed milk foam"),
            new Coffee(2,"Americano", "Espresso, hot water and foam")
        ));
    }
    
} 

