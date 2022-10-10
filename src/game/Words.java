package game;

import java.util.Random;

public class Words {

    private final String[] randomWords = {
            "animals",
            "happiness",
            "indefinite",
            "steady",
            "birthday",
            "extreme",
            "rights",
            "properties",
            "ceremony",
            "independence",
            "beneath",
            "information",
            "students",
            "employee"
    };
    private String selectedWord;
    private Random random = new Random();
    private char[] letters;

    public Words() {
        selectedWord = randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    }

    public String toString(){
        StringBuilder text = new StringBuilder();
        for (char letter : letters) {
            if (letter == '\u0000') {
                text.append('-');
            } else {
                text.append(letter);
            }
            text.append(' ');
        }

        return text.toString();
    }

}
