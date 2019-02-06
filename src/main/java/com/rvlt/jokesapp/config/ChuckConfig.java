package com.rvlt.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Java based spring bean configuration
public class ChuckConfig {

    @Bean // This method provides a ChuckNorrisQuotes bean to the context
    // Created from an external jar (dependency)
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
