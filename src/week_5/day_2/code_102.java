package week_5.day_2;
import java.util.Scanner;



public class code_102 {
    public static void voting (int num ){
        if (num>17){
            System.out.println("you are eligible for voting ");
        }
        else if (num<=17){
            System.out.println("you are not adult enough to vote ");
        }
        else if (num>105){
            System.out.println("you are kidding you cannot be alive get a life bro ");
            System.out.println("enter valid age ");
        }
        else {
            System.out.println("enter valid age ");

        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your age --> ");
        int num = input.nextInt();
        voting(num);
    }
}

