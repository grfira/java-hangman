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

    public String printResult(boolean finalResult) {

        if (finalResult) {
            return GAMEWIN;
        } else {
            return GAMELOSE;
        }
    }

    public String printGameState(int level, String playerWord) {
        String word = playerWord.replaceAll(".(?!$)","$0 ");
        StringBuilder stringBuilder = new StringBuilder(HANGMANPICS[level]);
        stringBuilder.insert(31, "\t\t" + word);
        return stringBuilder.toString();
    }

//    public String printInfo(String info) {
//        return info;
//    }

}