package week_5.day_2;

import java.util.Scanner;

public class code_101 {
    public static void game (int num){
        int random = (int)(Math.random()*10)+1;
        if(random==num){
            System.out.println("YOU WON ");
        }else {
            System.out.println("YOU LOST");
            System.out.println("BTW MY NUMBER WAS "+random);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("GUESS NUMBER BETWEEN 1 TO 10 ");
        System.out.print("enter number--> ");
        int num = input.nextInt();
        game(num);
    }
}
