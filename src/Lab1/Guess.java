package Lab1;

import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess; //Number the user tries to guess
        int guess; //The user's guess

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //randomly generate the number to guess
        int max = 10;
        numToGuess = generator.nextInt(max + 1);  //The bound is the max number the generator goes to exclusive
        //print message asking user to enter a guess
        System.out.println("Guess a number between 1 and 10: ");

        //read in guess
        guess = scan.nextInt();

        int count;
        count = 0; //initialized count

        int countHigh;
        countHigh = 0;

        int countLow;
        countLow = 0;
        while (guess != numToGuess) //keep going as long as the guess is wrong
        {
            //print message saying guess is wrong
            if (guess < numToGuess)
                System.out.println("Your guess is too low, try again");
                countLow = countLow + 1;

            if (guess > numToGuess)
                System.out.println("Your guess is too high, try again");
                countHigh = countHigh + 1;

            count = count + 1; //This count tells the user how many tries it took them to guess

            //get another guess from the user
            guess = scan.nextInt();
        }

        //print message saying guess is right
        System.out.println("Congratulations! You guessed correctly in " + count + " guesses!");
        System.out.println("Number of guesses too high: " + countHigh);
        System.out.println("Number of guesses too low: " + countLow);
    }
}