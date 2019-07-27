package Lab1;

import java.util.Scanner;
import java.io.*;

public class BaseballStats
{
    //-------------------------------------------------
    // Reads baseball stats from a file and counts
    // total hits, outs, walks, and sacrifice flies
    // for each player.
    //-------------------------------------------------
    public static void main (String[] args) throws IOException
    {
        Scanner fileScan, lineScan;
        String fileName;
        String lines;

        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the name of the input file: ");
        fileName = scan.nextLine();

        fileScan = new Scanner(new File(fileName));

        // Read and process each line of the file
        while(fileScan.hasNext()) {
            lines = fileScan.nextLine();
            System.out.println(fileName);


            lineScan = new Scanner(lines);
            lineScan.useDelimiter(" ");

            while (lineScan.hasNext()) {
                System.out.println("   " + lineScan.next());

                System.out.println();
            }
        }
    }
}