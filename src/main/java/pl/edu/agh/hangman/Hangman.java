package pl.edu.agh.hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        RandomWordProvider words = chooseRandomWordProvider();
        Game game = new Game(words.getRandomWord());
        do {
        } while (game.updateGameState(getChar()));
    }

    private static char getChar() {
        System.out.print("guess> ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }

    private static RandomWordProvider chooseRandomWordProvider() {
        RandomWordProvider randomWordProvider = null;
        do {
            System.out.println("Select the source of a random word ");
            System.out.println("1. From file :");
            System.out.println("2. From the Internet :");

            Scanner scanner = new Scanner(System.in);
            int getType = scanner.nextLine().charAt(0);
            switch (getType) {
                case '1' -> randomWordProvider = new RandomWordFromFile();
                case '2' -> randomWordProvider = new RandomWordFromInternet();
                default -> System.out.println("Invalid value! Try again");
            }
        } while (randomWordProvider == null);
        return randomWordProvider;
    }
}
