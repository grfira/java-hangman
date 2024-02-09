package pl.edu.agh.hangman;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomWordFromInternet extends RandomWordProvider {
    @Override
    protected List<String> getWords() {
        Document doc = null;
        List<String> result = null;
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
        return new ArrayList<>(Arrays.asList(words));
    }

}
