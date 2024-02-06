package pl.edu.agh.hangman;

import java.util.Scanner;


public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public static final String GAMELOSE = "°՞(ᗒᗣᗕ)՞°";

    public static final String GAMEWIN = "(ﾉ◕ヮ◕)ﾉ*:・ﾟ✧";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RandomWord random = null;
        System.out.println("Wprowadz numer odpowiadajacy z czego mam wczytac słowa ");
        System.out.println("1. Z pliku :");
        System.out.println("2. Z internetu :");
        String getType = null;
        getType = scanner.nextLine();

        if(getType.contains("1"))
            random = new RandomWordFromFile();
        else if (getType.contains("2"))
            random = new RandomWordFromInternet();

        String s = random.getRandomWord();
        System.out.println(s);
        CheckResult logic = new CheckResult(s);
        String input;

        do{
           // Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj literke : ");
            input = scanner.nextLine();


        }while(logic.checkLetter(input.charAt(0)));


   
    }
}
