package pl.edu.agh.hangman;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RandomWordFromFIleTest {

    @Test
    public void getRandomWordTest() {
        RandomWordProvider randomWordProvider = new RandomWordFromFile();
        String word = null;
        assertNotEquals(randomWordProvider.getRandomWord(), word);
    }

}
