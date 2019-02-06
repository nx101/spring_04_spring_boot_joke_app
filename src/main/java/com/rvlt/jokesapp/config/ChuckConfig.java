package com.rvlt.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


// Switched to legacy XML config, this java config class no longer used or 'seen' by spring

//@Configuration // Java based spring bean configuration
public class ChuckConfig {

    //@Bean // This method provides a ChuckNorrisQuotes bean to the context
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes(); // Created from an external jar (dependency)
    }
}
