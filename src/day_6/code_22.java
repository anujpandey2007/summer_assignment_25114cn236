package day_6;

import java.util.Scanner;

public class code_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter binary string -->");
        String binaryStr = input.next();

        int decimal = 0;
        //binary to decimal
        for (int i = 0; i < binaryStr.length(); i++) {
            // shift num to left by 1  by adding 0 at right
            decimal = decimal << 1;
            //convert string into respective number
            int bit = binaryStr.charAt(i) - '0';
            //stores same number into decimal
            decimal = decimal | bit;
        }

        System.out.println("decimal: " + decimal);
        input.close();
    }
}