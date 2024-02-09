package pl.edu.agh.hangman;

import static pl.edu.agh.hangman.PrintResult.printInfo;
import static pl.edu.agh.hangman.PrintResult.printGameState;
import static pl.edu.agh.hangman.PrintResult.printResult;

public class Game {
    public static final String BLANK_SIGN = "_";
    private int level = 0;
    private final String wordToFind;
    private String currentWord;

    public Game(String wordToFind) {
        this.wordToFind = wordToFind.toUpperCase();
        this.currentWord = BLANK_SIGN.repeat(wordToFind.length());
        printGameState(level, currentWord);
    }

    public boolean updateGameState(char letter) {
        processLetter(Character.toUpperCase(letter));
        printGameState(level, currentWord);

        if (!currentWord.contains(BLANK_SIGN)) {
            printResult(true);
            return false;
        }
        if (level >= PrintResult.HANGMANPICS.length-1) {
            printResult(false);
            printInfo("The correct word: "+ wordToFind);
            return false;
        }
        return true;
    }

    private void processLetter(char letter) {
        if (wordToFind.indexOf(letter) < 0) {
            level++;
        } else {
            StringBuilder word = new StringBuilder(currentWord);
            for (int i = 0; i < this.wordToFind.length(); i++) {
                if (wordToFind.charAt(i) == letter) {
                    word.replace(i, i + 1, String.valueOf(letter));
                }
            }
            currentWord = word.toString();
        }
    }
}
