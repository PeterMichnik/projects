package guess;

import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        UserInputHandler userInputHandler = new UserInputHandler();
        int numberToGuess = random.nextInt(100);

        System.out.println(numberToGuess);

        int attemptsLeft = 5;
        while (attemptsLeft > 0) {
            System.out.print("Guess the number in the range 0-99: ");
            int number = userInputHandler.getNumberFromUser();

            if (number > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess");
            } else if (number < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess");
            } else {
                System.out.println("You guessed it !.The number is: " + numberToGuess);
                break;
            }

            if (attemptsLeft > 1) {
                System.out.println("Please try again\r\nYou have " + (attemptsLeft - 1) + " tries" + "\r\n");
            } else {
                System.out.println("That was your last try");
            }
            attemptsLeft--;
        }
    }
}
