package week_4.day_5;

import java.util.*;

public class code_92
{
    public static List<Character> maxRepeatingChar(String str) {
        str= str.trim();
        //empty string
        if (str == null || str.isEmpty()) {
            System.out.println("empty string ");
        }
        int size = str.length();

        //the frequency map
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        ArrayList<Character> maxChar = new ArrayList<>();
        int maxCount = 0;

        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > maxCount) {
                maxCount = charCountMap.get(ch);
                maxChar.clear();;
                maxChar.add(ch);
            }
            else if (charCountMap.get(ch) == maxCount){
                maxChar.add(ch);

            }
        }

        return maxChar;
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = input.nextLine();
        System.out.println("max repeating character in entered string is " + maxRepeatingChar(str));
        input.close();

    }

}
