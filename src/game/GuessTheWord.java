package game;

import java.util.Scanner;

public class GuessTheWord {

    private boolean play = true;
    private Words randomWord = new Words();
    Scanner scanner = new Scanner(System.in);
    public void start() {

        do {
            showWord();
            getInput();
            checkInput();
        }
        while(play);
    }

    private void showWord() {
        System.out.println(randomWord);
    }

    private void getInput() {
        System.out.println("Enter a letter to guess the word");
        String userGuess = scanner.nextLine();
        char letter;
        randomWord.guess(userGuess.charAt(0));
    }

    private void checkInput() {

        System.out.println("checkinput");
    }

    public void end() {
        scanner.close();
    }
}
