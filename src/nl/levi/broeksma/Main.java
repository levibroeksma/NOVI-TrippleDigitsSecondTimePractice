package nl.levi.broeksma;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // generate numbers to guess
            // strore number in variables

        // if correct, player wins
            // if player wins, congratulate, game is finished. Ask if he wants to play again
        // if incorret, player gets to play another round if total rounds is less then 3
            // if player guessed incorrectly for 3rd time, player has lost, ask if he want's to play again
        for (int i = 0; i < 3; i++) {
            int firstDigit;
            int secondDigit;
            int thirdDigit;

            int maximum = 9;

            Random randomizer = new Random();

            firstDigit = randomizer.nextInt(maximum) + 1;
            secondDigit = randomizer.nextInt(maximum) + 1;
            thirdDigit = randomizer.nextInt(maximum) + 1;

            // as a hint the player gets a sum and a multiplication of the numbers
            int sumOfDigits = firstDigit + secondDigit + thirdDigit;
            int multiplicationOfDigits = firstDigit * secondDigit * thirdDigit;

            System.out.println("The sum of the Digits is: " + sumOfDigits);
            System.out.println("The multiplication of the Digits is: " + multiplicationOfDigits);

            // Let the player enter 3 numbers between 1 and 9
            System.out.println("Please enter a number between 1 and 9:");
            Scanner input = new Scanner(System.in);
            int guessOne = input.nextInt();
            System.out.println("Please enter another number between 1 and 9:");
            int guessTwo = input.nextInt();
            System.out.println("Please enter another number between 1 and 9:");
            int guessThree = input.nextInt();

            System.out.println("Your guesses where: " + guessOne + ", " + guessTwo + ", " + guessThree);
            // check numbers if they match generated numbers
            boolean hasPlayerWon =
                    guessOne == firstDigit && guessTwo == secondDigit && guessThree == thirdDigit ||
                            guessOne == firstDigit && guessTwo == thirdDigit && guessThree == secondDigit ||
                            guessOne == secondDigit && guessTwo == firstDigit && guessThree == thirdDigit ||
                            guessOne == secondDigit && guessTwo == thirdDigit && guessThree == firstDigit ||
                            guessOne == thirdDigit && guessTwo == secondDigit && guessThree == firstDigit ||
                            guessOne == thirdDigit && guessTwo == firstDigit && guessThree == secondDigit;

            // order of guessed numbers should not matter
            if(hasPlayerWon == true) {
                System.out.println("Congratulations! You have beaten the game.");
                System.out.println("\n");
            } else {
                System.out.println("Too bad, you have answered incorrectly.");
                System.out.println("\n");
            }

        }
        System.out.println("Het spel is afgelopen");

    }
}
