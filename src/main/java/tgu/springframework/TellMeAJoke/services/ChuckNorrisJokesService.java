package tgu.springframework.TellMeAJoke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokesService implements TellAJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;
    
    public ChuckNorrisJokesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String TellAJoke() {
        return chuckNorrisQuotes.getRandomQuote();   
    }

}
