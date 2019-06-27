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
        ArrayList<Item> shoppingCart = new ArrayList<Item>();

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
           Item item1 = new Item("MacBook Pro", 2599.99, 3);
           Item item2 = new Item("MacBook Air",1299.99, 2);
           Item item3 = new Item("iPhone XR",999.99,4);
           Item item4 = new Item("HomePod",299.99,2);

           shoppingCart.add(item1);
           shoppingCart.add(item2);
           shoppingCart.add(item3);
           shoppingCart.add(item4);

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
            System.out.println();

        } while (keepShopping.equals("y"));

        // *** print the contents of the cart object using println
        System.out.println("Shopping cart contents: " + shoppingCart);
    }
}

