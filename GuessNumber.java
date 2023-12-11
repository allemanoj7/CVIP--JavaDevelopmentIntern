import java.util.*;

class GuessNumner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secretWord = "5";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;

        while (!guess.equals(secretWord) && !outOfGuesses) {

            if (guessCount < guessLimit) {
                System.out.print("Enter a guess : ");
                guess = sc.nextLine();
                guessCount++;
            } else {
                outOfGuesses = true;
            }
        }
        if (outOfGuesses) {
            System.out.println("You Lose! No more guesses");
        } else {
            System.out.println("You Win!");
        }
        sc.close();
    }
}