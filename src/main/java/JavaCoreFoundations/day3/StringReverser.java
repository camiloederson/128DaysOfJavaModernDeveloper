package JavaCoreFoundations.day3;

import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the word you want to reverse: ");
        String string = scanner.nextLine();
        System.out.println("🧠 " + string + " backwards is " + reverseString(string));
        scanner.close();
    }

    public static String reverseString(String string){
        StringBuilder reverseString = new StringBuilder();
        for (int i = string.length() -1; i >= 0 ; i--) {
            reverseString.append(string.charAt(i));
        }
        return reverseString.toString();
    }
}
