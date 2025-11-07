package JavaCoreFoundations.day3;

import java.util.Scanner;

public class StringChallenges {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("🔢Type the word you want to test: ");

        String word = scanner.nextLine();
        System.out.println("✅ has " + countVowels(word) + " vowels");

        scanner.close();
    }

    public static int countVowels (String word){
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = Character.toUpperCase(word.charAt(i));
            switch (currentChar){
                case 'A', 'E', 'I', 'O', 'U': counter++;
                    break;
            }
        }
        return counter;
    }
}
