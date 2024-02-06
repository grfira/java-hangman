package pl.edu.agh.hangman;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomWordFromInternet extends RandomWord {

    private ArrayList<String> getWordsFromInternet(){
        Document doc = null;
        ArrayList<String> result = null;
        String[] words = null;
        try {
            doc = Jsoup.connect("http://www.wp.pl").get();
            String text = doc.body().text();
            String[] sentences = text.split("\\. ");

            for (String sentence : sentences) {
                words = sentence.split(" ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        result  = new ArrayList<>(Arrays.asList(words));

        return result;

    }

    @Override
    public String getRandomWord() {
        Random random = new Random();
        ArrayList<String> randomWord = getWordsFromInternet();
        return randomWord.get(random.nextInt(randomWord.size()));
    }
}
