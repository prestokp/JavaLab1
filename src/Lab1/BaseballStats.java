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
        String names;
        String fileText;
        String marker;

        //declares relevant integer variables
        int bat = 0;
        int hits = 0;
        int outs = 0;
        int walks = 0;
        int sacrifices = 0;

        //batting average
        double batAverage;

        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the name of the input file: ");
        fileName = scan.nextLine();

        fileScan = new Scanner(new File(fileName));
        if(fileScan.hasNextLine()){
            System.out.println("Name\t\tBats\tHits\tOuts\tWalks\tSacrifices\tBatting Average");
        }

        // Read and process each line of the file
        while(fileScan.hasNext()) {


            lines = fileScan.nextLine();
            names = lines.substring(0, lines.indexOf(","));
            System.out.println(names + "      ");

            fileText = lines.substring(lines.indexOf(",")+1);
            while(fileText.contains(",")){
                marker = fileText.substring(0, fileText.indexOf(","));

                //Inner lines of the file, counting conditionals for the
                //different statistics
                if(marker.equals("h")){
                    hits++;
                }
                else if(marker.equals("o")){
                    outs++;
                }
                else if(marker.equals("w")){
                    walks++;
                }
                else if(marker.equals("s")){
                    sacrifices++;
                }

                fileText = fileText.substring(fileText.indexOf(",") + 1);

            }

            if(fileText.equals("h")){
                hits++;
            }
            else if(fileText.equals("o")){
                outs++;
            }
            else if(fileText.equals("w")){
                walks++;
            }
            else if(fileText.equals("s")){
                sacrifices++;
            }

            //total bats
            bat = hits + outs + walks + sacrifices;

            batAverage = (double)hits/(hits + outs);
            System.out.println(bat + "\t\t" + hits + "\t\t" +
                    outs + "\t\t" + walks + "\t\t" + sacrifices + "\n" + batAverage);
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