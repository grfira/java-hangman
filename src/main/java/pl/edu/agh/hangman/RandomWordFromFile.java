package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class RandomWordFromFile extends RandomWordProvider {
    @Override
    protected List<String> getWords() {

        File file = new File("src/main/resources/slowa.txt");
        List<String> allWords = new ArrayList<>();
        String line = null;

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(file.toPath());
            while ((line = bufferedReader.readLine()) != null) {
                allWords.add(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allWords;
    }


}
