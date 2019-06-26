package Lab1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int factorialInt;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a non zero, non-negative integer: ");

        factorialInt = scan.nextInt();

        while (factorialInt <= 0){

            System.out.println("Do not enter negative integers or zero.");
            System.out.println("Enter a non zero, non-negative integer: ");

            factorialInt = scan.nextInt();
        }
        int count;
        count = 1; //this gets the multiplication to start at one
        while(count < factorialInt){  //once the count hits the factorial integer that was entered then, then it stops
            //the while loop iterates until that condition is hit
            factorialInt = count * (count + 1);
            //The count has to go up by one each time as its multiplied because it's a factorial 1*2*3*4
        }

    }
}