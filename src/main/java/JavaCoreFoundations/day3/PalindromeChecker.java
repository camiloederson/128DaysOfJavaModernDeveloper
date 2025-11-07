package JavaCoreFoundations.day3;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("🆎 Palindrome Checker");
        System.out.print("Type a word: ");
        String string = scanner.nextLine().trim();
        boolean result = palindromeChecker(string);
        System.out.println(result ? "✅ Palindrome Bro!" : "❌ Nope Dude");
        System.out.println("🍵 You never know Pa!!");
        scanner.close();
    }

    public static boolean palindromeChecker(String string){
        if (string.isEmpty()) return false;
        string = string.replaceAll("\\s+", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString().equals(string);
    }
}
