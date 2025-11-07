package JavaCoreFoundations.day3;

import java.util.Scanner;

public class CompareStringsIgnoreCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("❇️ This program compares two strings but ignores case: ");
        System.out.println("🆎 Type the first word: ");
        String s1 = scanner.nextLine();
        System.out.println("🆎 Type the second word: ");
        String s2 = scanner.nextLine();
        System.out.println(compareStringsIgnoreCase(s1, s2) ? "✅ Yes: Both words are equals" : "❌ Nope. Words are not equals");
        scanner.close();
    }

    public static boolean compareStringsIgnoreCase(String s1,String s2){
        return s1.equalsIgnoreCase(s2);
    }
}
