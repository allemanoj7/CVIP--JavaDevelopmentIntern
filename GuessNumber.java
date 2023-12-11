import java.util.*;

class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretNumber = "5";
        String userGuess = "";
        int numberOfGuesses = 0;
        int guessLimit = 3;
        boolean outOfAttempts = false;

        while (!userGuess.equals(secretNumber) && !outOfAttempts) {
            if (numberOfGuesses < guessLimit) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextLine();
                numberOfGuesses++;
            } else {
                outOfAttempts = true;
            }
        }

        if (outOfAttempts) {
            System.out.println("You Lose! No more guesses");
        } else {
            System.out.println("You Win!");
        }

        scanner.close();
    }
}
