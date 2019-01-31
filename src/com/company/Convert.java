package com.company;

public class Convert {

    public static void rgbToHex(int r, int g, int b){
        int remainder = 0;
        String resultR = "";
        String resultG = "";
        String resultB = "";
        char hexadecimal [] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while(r > 0) {
            remainder = r % 16;
            resultR = hexadecimal[remainder] + resultR;
            r = r / 16;
        }

        while(g > 0) {
            remainder = g % 16;
            resultG = hexadecimal[remainder] + resultG;
            g = g / 16;
        }

        while(b > 0) {
            remainder = b % 16;
            resultB = hexadecimal[remainder] + resultB;
            b = b / 16;
        }

        System.out.println(resultR + resultG + resultB);

    }



    public static void hexToRGB(String first, String second, String last) {
        int subZeroFirst = 0;
        int subOneFirst = 0;
        int subZeroSecond = 0;
        int subOneSecond = 0;
        int subZeroLast = 0;
        int subOneLast = 0;

        //Checks the fist number to see if it is a letter or not
        if(first.substring(0, 1).toUpperCase().equals("A")){
            subZeroFirst = 10;
        }
        else if(first.substring(0, 1).toUpperCase().equals("B")){
            subZeroFirst = 11;
        }
        else if(first.substring(0, 1).toUpperCase().equals("C")){
            subZeroFirst = 12;
        }
        else if(first.substring(0, 1).toUpperCase().equals("D")){
            subZeroFirst = 13;
        }
        else if(first.substring(0, 1).toUpperCase().equals("E")){
            subZeroFirst = 14;
        }
        else if(first.substring(0, 1).toUpperCase().equals("F")){
            subZeroFirst = 15;
        }
        else {
            subZeroFirst = Integer.parseInt(first.substring(0, 1));
        }



        if(first.substring(1, 2).toUpperCase().equals("A")){
            subOneFirst = 10;
        }
        else if(first.substring(1, 2).toUpperCase().equals("B")){
            subOneFirst = 11;
        }
        else if(first.substring(1, 2).toUpperCase().equals("C")){
            subOneFirst = 12;
        }
        else if(first.substring(1, 2).toUpperCase().equals("D")){
            subOneFirst = 13;
        }
        else if(first.substring(1, 2).toUpperCase().equals("E")){
            subOneFirst = 14;
        }
        else if(first.substring(1, 2).toUpperCase().equals("F")){
            subOneFirst = 15;
        }
        else {
            subOneFirst = Integer.parseInt(first.substring(1, 2));
        }

        //Checks the second number to see if it is a letter or not
        if(second.substring(0, 1).toUpperCase().equals("A")){
            subZeroSecond = 10;
        }
        else if(second.substring(0, 1).toUpperCase().equals("B")){
            subZeroSecond = 11;
        }
        else if(second.substring(0, 1).toUpperCase().equals("C")){
            subZeroSecond = 12;
        }
        else if(second.substring(0, 1).toUpperCase().equals("D")){
            subZeroSecond = 13;
        }
        else if(second.substring(0, 1).toUpperCase().equals("E")){
            subZeroSecond = 14;
        }
        else if(second.substring(0, 1).toUpperCase().equals("F")){
            subZeroSecond = 15;
        }
        else {
            subZeroSecond = Integer.parseInt(second.substring(0, 1));
        }



        if(second.substring(1, 2).toUpperCase().equals("A")){
            subOneSecond = 10;
        }
        else if(second.substring(1, 2).toUpperCase().equals("B")){
            subOneSecond = 11;
        }
        else if(second.substring(1, 2).toUpperCase().equals("C")){
            subOneSecond = 12;
        }
        else if(second.substring(1, 2).toUpperCase().equals("D")){
            subOneSecond = 13;
        }
        else if(second.substring(1, 2).toUpperCase().equals("E")){
            subOneSecond = 14;
        }
        else if(second.substring(1, 2).toUpperCase().equals("F")){
            subOneSecond = 15;
        }
        else {
            subOneSecond = Integer.parseInt(second.substring(1, 2));
        }

        //Checks the third number to see if it is a letter or not
        if(last.substring(0, 1).toUpperCase().equals("A")){
            subZeroLast = 10;
        }
        else if(last.substring(0, 1).toUpperCase().equals("B")){
            subZeroLast = 11;
        }
        else if(last.substring(0, 1).toUpperCase().equals("C")){
            subZeroLast = 12;
        }
        else if(last.substring(0, 1).toUpperCase().equals("D")){
            subZeroLast = 13;
        }
        else if(last.substring(0, 1).toUpperCase().equals("E")){
            subZeroLast = 14;
        }
        else if(last.substring(0, 1).toUpperCase().equals("F")){
            subZeroLast = 15;
        }
        else {
            subZeroLast = Integer.parseInt(last.substring(0, 1));
        }



        if(last.substring(1, 2).toUpperCase().equals("A")){
            subOneLast = 10;
        }
        else if(last.substring(1, 2).toUpperCase().equals("B")){
            subOneLast = 11;
        }
        else if(last.substring(1, 2).toUpperCase().equals("C")){
            subOneLast = 12;
        }
        else if(last.substring(1, 2).toUpperCase().equals("D")){
            subOneLast = 13;
        }
        else if(last.substring(1, 2).toUpperCase().equals("E")){
            subOneLast = 14;
        }
        else if(last.substring(1, 2).toUpperCase().equals("F")){
            subOneLast = 15;
        }
        else {
            subOneLast = Integer.parseInt(last.substring(1, 2));
        }
        int finalFirst = (subZeroFirst * 16) + subOneFirst;
        int finalSecond = (subZeroSecond * 16) + subOneSecond;
        int finalLast = (subZeroLast * 16) + subOneLast;

        System.out.println("r: " + finalFirst + " g: " + finalSecond + " b: " + finalLast);

    }





}
