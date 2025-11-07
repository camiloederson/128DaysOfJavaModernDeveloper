package JavaCoreFoundations.day3;

import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your sentence: ");
        String string = scanner.nextLine().trim();
        System.out.println("📏 Longer word: " + wordFinder(string));
        scanner.close();
    }

    public static String wordFinder(String string){
        String[] words = string.split("\\s+");
        String word ="";
        for (int i = 0; i < words.length ; i++) {
            if (word.length() < words[i].length()) word = words[i];
        }
        return word;
    }
}
