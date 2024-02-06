package pl.edu.agh.hangman;

import static pl.edu.agh.hangman.Hangman.*;

public class PrintResult {

    public static boolean printResult(int level, String playerWord, String correctWord) {

      //  System.out.println(level + playerWord + correctWord);
       if(level < 7) {
           StringBuilder stringBuilder = new StringBuilder(HANGMANPICS[level]);
           stringBuilder.insert(31, "\t" + playerWord);
           System.out.println(stringBuilder);
       }
       else {
           System.out.println(GAMELOSE);
           return false;}

       if(playerWord.contains(correctWord)){
           System.out.println(GAMEWIN);
           return false;
       }

        return true;
    }
}