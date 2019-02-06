package com.rvlt.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class JokeServiceImp implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;


    // Inject via Constructor
    // To provide a ChuckNorrisQuotes bean in the context,
    // we use Java based config
    public JokeServiceImp(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }


    // Instantiate at constructor
    //public JokeServiceImp(){ this.chuckNorrisQuotes = new ChuckNorrisQuotes(); }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
