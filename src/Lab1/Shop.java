package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {
        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        Scanner scan = new Scanner(System.in);

        // Declare and instantiate your ArrayList object

        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();

            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();	// we need to burn the newline for later
            System.out.println();

            // *** create a new item and add it to the cart

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
            System.out.println();
        } while (keepShopping.equals("y"));

        // *** print the contents of the cart object using println
    }
}

