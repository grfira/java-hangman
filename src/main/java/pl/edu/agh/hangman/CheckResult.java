package pl.edu.agh.hangman;

import static pl.edu.agh.hangman.PrintResult.printResult;

public class CheckResult {
    int level = 0;
    String wordToFind;
    StringBuilder currentWord;

    public CheckResult(String wordToFind) {
        this.wordToFind = wordToFind.toUpperCase();
        //StringBuilder currentWord = new StringBuilder("_".repeat(wordToFind.length()));
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < wordToFind.length(); i++) {
            currentWord.append("_");
        }
        this.currentWord=currentWord;


    }

    public boolean checkLetter(char letter) {
        boolean state = true;
        char letterUpper = Character.toUpperCase(letter);
        if (this.wordToFind.indexOf(letterUpper) < 0) {
            level++;
        } else {

            for (int i = 0; i < this.wordToFind.length(); i++) {
                if (this.wordToFind.charAt(i) == letterUpper) {
                    this.currentWord.replace(i, i+1, String.valueOf(letterUpper));
                }
            }
        }

        return (printResult(level, this.currentWord.toString(), this.wordToFind) && this.currentWord.toString().contains("_"));
    }
}
