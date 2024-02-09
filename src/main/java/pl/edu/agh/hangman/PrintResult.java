package pl.edu.agh.hangman;

public class PrintResult {
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

    public static void printResult(boolean finalResult) {

        if (finalResult) {
            System.out.println(GAMEWIN);
        } else {
            System.out.println(GAMELOSE);
        }
    }

    public static void printGameState(int level, String playerWord) {
        String word = playerWord.replaceAll(".(?!$)","$0 ");
        StringBuilder stringBuilder = new StringBuilder(HANGMANPICS[level]);
        stringBuilder.insert(31, "\t\t" + word);
        System.out.println(stringBuilder);
    }

    public static void printInfo(String info) {
        System.out.println(info);
    }

}