package com.dtlev.lrnspb;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomConfig {
    @Bean
    public Random getRandom() {
        return new Random();
    }
}
