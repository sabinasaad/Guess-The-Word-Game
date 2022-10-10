package game;

public class GuessTheWord {

    private boolean play = false;
    private Words randomWord = new Words();
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
        System.out.println("getInput");
    }

    private void checkInput() {
        System.out.println("checkinput");
    }



}
