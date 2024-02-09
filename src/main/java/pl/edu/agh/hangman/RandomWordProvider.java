package pl.edu.agh.hangman;

import java.util.List;
import java.util.Random;

public abstract class RandomWordProvider {

    protected abstract List<String> getWords();

    public String getRandomWord() {
        Random random = new Random();
        List<String> words = getWords();
        return words.get(random.nextInt(words.size()));
    }
}
