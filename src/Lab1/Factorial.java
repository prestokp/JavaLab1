package Lab1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int factInt;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a non zero, non-negative integer: ");

        factInt = scan.nextInt();

        while (factInt <= 0){

            System.out.println("Do not enter negative integers or zero.");
            System.out.println("Enter a non zero, non-negative integer: ");

            factInt = scan.nextInt();
        }

        int count,fact = 1; //count is the variable that will change with each iteration to match the factorial pattern
                            //fact is the variable that will be the initializing number to get the mathematical process
                            //started and off the ground

                            //factInt is the variable that we are multiplying to, enforced via a conditional statement
                            //in a for loop
        for (count = 1; count <= factInt; count++){
            fact = fact * count;
        }

        System.out.println("The factorial of " + factInt + " = " + fact);

        /*int count;
        count = 1; //this gets the multiplication to start at one
        while(count < factInt){  //once the count hits the factorial integer that was entered then, then it stops
            //the while loop iterates until that condition is hit
            factorialInt = count * (count + 1);
            //The count has to go up by one each time as its multiplied because it's a factorial 1*2*3*4
        }
*/
    }
}