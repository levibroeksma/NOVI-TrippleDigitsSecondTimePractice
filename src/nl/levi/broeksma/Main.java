package nl.levi.broeksma;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

        int maxTimesToPlay = 3;
        for (int i = 0; i < maxTimesToPlay; i++) {
            System.out.println("Please enter a number between 1 and 9:");
            Scanner input = new Scanner(System.in);
            int guessOne = input.nextInt();

            System.out.println("Please enter another number between 1 and 9:");
            int guessTwo = input.nextInt();

            System.out.println("Please enter another number between 1 and 9:");
            int guessThree = input.nextInt();

            System.out.println("Your guesses where: " + guessOne + ", " + guessTwo + ", " + guessThree);
            // check numbers if they match generated numbers

            int sumOfGuesses = guessOne + guessTwo + guessThree;
            int multiplicationOfGuesses = guessOne * guessTwo * guessThree;
            boolean hasPlayerWon = sumOfDigits == sumOfGuesses && multiplicationOfDigits == multiplicationOfGuesses;

            if(hasPlayerWon == true) {
                System.out.println("Congratulations! You have beaten the game.");
                System.out.println("\n");
            } else {
                System.out.println("Too bad, you have answered incorrectly.");
                System.out.println("\n");
            }

            // Ask player if he wants to continue playing
            boolean playAgain = true;

            System.out.println("Do you want to play another game? Please enter y/n");

            String continuePlaying = input.next();

            switch(continuePlaying) {
                case "y" :{
                    System.out.println("You have chosen to play another round");
                    playAgain = true;
                    break;
                }
                case "n" :{
                    System.out.println("Thank you for playing, see you next time!");
                    playAgain = false;
                    break;
                }
                default: {
                    System.out.println("Wrong value has been entered.");
                    break;
                }

            }

            // Terminate game if player choice equals no
            if(playAgain == false) {
                break;
            }

        }

        // Notify game has been ended
        System.out.println("Het spel is afgelopen");

    }
}
