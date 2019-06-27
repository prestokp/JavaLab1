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

        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the name of the input file: ");
        fileName = scan.nextLine();

        while(fileScan.hasNext()){
            fileName = fileScan.nextLine()
        }

        fileScan = new Scanner(new File(fileName));
        // Read and process each line of the file
    }
}