package JavaCoreFoundations.day3;

import java.util.Scanner;

public class WordsCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("🖥️ Type the sentence dude! ");
        String string = scanner.nextLine().trim();
        System.out.println("🔢 -> " + wordCounter(string) + " words");
        System.out.println("🍵 See ya!");
        scanner.close();
    }

    public static int wordCounter(String string){
        String[] words = string.split("\\s+");
        return words.length;
    }
}
