package JavaCoreFoundations.day3;

import java.util.Scanner;

public class CountLettersAndDigits {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);
         System.out.println("Type your word bro!");
         String string = scanner.nextLine().trim();
         int[] result = countLettersAndDigits(string);
         System.out.println("🆎 Letters: " + result[0]);
         System.out.println("🔢 Digits: " + result[1]);
         System.out.println("🤠 That's all folks");
         scanner.close();
     }

     public static int[] countLettersAndDigits(String string){
         int[] counter = {0, 0};
         for (int i = 0; i < string.length(); i++) {
             if(Character.isLetter(string.charAt(i))){
                 counter[0]++;
             }
             else if (Character.isDigit(string.charAt(i))){
                 counter[1]++;
             }
         }
         return counter;
     }
}
