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
            item = new Item(itemName, itemPrice, quantity);
            shoppingCart.add(item);

            /*Item item1 = new Item("Model S", 129999.99, 2);
            Item item2 = new Item("Model 3", 59999.99, 2);
            Item item3 = new Item("Model X", 159999.99, 3);
            Item item4 = new Item("Model Y", 49999.99, 2);

            shoppingCart.add(item1);
            shoppingCart.add(item2);
            shoppingCart.add(item3);
            shoppingCart.add(item4);*/

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
            System.out.println();

        } while (keepShopping.equals("y"));

        // *** print the contents of the cart object using println
        double total; //summing pattern to get the total cost of the shopping cart
        double sum;   //gets the total cost of an item by multiplying the cost by the quantity
        int count;

        total = 0;
        sum = item.getPrice() * item.getQuantity();

        System.out.println("Shopping cart contents: ");
        for (count = 1; count <= shoppingCart.size(); count++){
            total = total + sum;
            System.out.println(shoppingCart.get(count-1));
        }
        System.out.println("Total: " + total);
    }
}

