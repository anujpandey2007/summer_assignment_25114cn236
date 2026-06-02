package day_6;

import java.util.Scanner;

public class code_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number -->");
        int num = input.nextInt();

        if (num ==0){
            System.out.println(" 0 ");
            return;
        }
        int temp = num;
        String binary= "";
        while(temp>0){
            int bit = temp & 1;
            binary = bit + binary;
            temp = temp>>1;
        }
        System.out.println("binary" + binary);
        input.close();
    }

}
