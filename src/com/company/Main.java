package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner jbReader = new Scanner(System.in);
        System.out.println("DUUUUDDE WHAT YOU TRYNA CONVERT THO???. (Enter a number 0 - 255 on 3 separate lines.)");

        int r = jbReader.nextInt();
        int g = jbReader.nextInt();
        int b = jbReader.nextInt();

        System.out.println("Here is the value in hex");
        Convert.rgbToHex(r, g, b);
    }
}
