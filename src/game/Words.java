package game;

import java.util.Random;

public class Words {

    private final String[] randomWords = {"animals", "happiness", "indefinite", "steady", "birthday", "extreme",
            "rights", "properties", "ceremony", "independence", "beneath", "information", "students", "employee"};
    private final String selectedWord;
    private final Random random = new Random();
    private final char[] letters;

    public Words() {
        selectedWord = randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    }

    public String toString() {
        StringBuilder text = new StringBuilder();
        for (char letter : letters) {
            text.append(letter == '\u0000' ? '-' : letter);
            text.append(' ');
        }

        return text.toString();
    }

    public boolean isGuessedRight() { //whole word

        for (char letter : letters) {
            if (letter == '\u0000') {
                return false;
            }
        }
        return true;
    }

    public boolean guess(char letter) {

        boolean guessedRight = false;

        for (int i = 0; i < selectedWord.length(); i++) {
            if (letter == selectedWord.charAt(i)) {
                letters[i] = letter;
                guessedRight = true;
            }
        }
        return guessedRight;
    }
}
