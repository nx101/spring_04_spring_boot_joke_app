package com.rvlt.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class Spring04SpringBootJokeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring04SpringBootJokeAppApplication.class, args);
    }



}

