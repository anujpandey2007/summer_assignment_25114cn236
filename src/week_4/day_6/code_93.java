package week_4.day_6;

import java.util.Scanner;

public class code_93 {
    public static boolean stringRotation(String Ostr, String Nstr){
        // trimming both string to ignore initial space
        Ostr=Ostr.trim();
        Nstr=Nstr.trim();
        String result = Ostr+Ostr;
        // iss result contains Nstr then it is rotated string
        if(result.contains(Nstr)){
            return true;
        }
        return false ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //populating 1st string
        System.out.print("enter string 1  : ");
        String str1 = input.next();
        //populating 2nd string
        System.out.print("enter string 2  : ");
        String str2 = input.next();
        if (stringRotation(str1,str2)){
            System.out.println("yes string 2 is rotated string of string 1 ");
        }
        else {
            System.out.println("string 2 is not rotated array");
        }

    }
}
