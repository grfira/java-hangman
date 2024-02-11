package pl.edu.agh.hangman;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class RandomWordFromInternetTest {

    @Test
    public void getRandomWordTest() {
        RandomWordProvider randomWordProvider = new RandomWordFromInternet();
        String word = null;
        assertNotEquals(randomWordProvider.getRandomWord(), word);
    }
}
