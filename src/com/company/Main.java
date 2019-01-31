package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner jbReader = new Scanner(System.in);
        System.out.println("Do you want ot convert from Hexadecimal -> Decimal or Decimal -> Hexadecimal. (HD for Hexadecimal -> Decimal and DH for Decimal -> Hexadecimal)");


        boolean continuee = true;
        while(continuee) {
            String hexOrDec = jbReader.next();
            if (hexOrDec.toUpperCase().equals("HD")) {
                System.out.println("What hexadecimal value do you want to convert to decimal? Please type in the first two digits.");
                String firstHex = jbReader.next();

                System.out.println("And the middle two...");
                String middleHex = jbReader.next();

                System.out.println("And the last two.");
                String lastHex = jbReader.next();

                System.out.println("Here is " + firstHex + middleHex + lastHex + " in RGB format.");
                Convert.hexToRGB(firstHex, middleHex, lastHex);
                continuee = false;

            }

            else if (hexOrDec.toUpperCase().equals("DH")) {
                System.out.println("What RGB value do you want to convert to hexadecimal? (Enter the first value.)");

                int r = jbReader.nextInt();
                System.out.println("And the second value...");
                int g = jbReader.nextInt();
                System.out.println("And the third.");
                int b = jbReader.nextInt();

                System.out.println("Here is " + r + " " + g + " " + b + " in hexadecimal.");
                Convert.rgbToHex(r, g, b);

                continuee = false;
            }

            else {
                System.out.println("Sorry I didn't get that. Do you want ot convert from Hexadecimal -> Decimal or Decimal -> Hexadecimal.");


            }

        }

    }
}
