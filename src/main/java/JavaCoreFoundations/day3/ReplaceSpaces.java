package JavaCoreFoundations.day3;

import JavaCoreFoundations.day1.StringVsStringBuilder;

import java.util.Scanner;

public class ReplaceSpaces {
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.print("🖥️ Type the string: ");
          String string = scanner.nextLine().trim();
          System.out.println("✍️ " + replaceSpaces(string));
          System.out.println("🍵 Bye for now!!");
          scanner.close();
      }

      public static String replaceSpaces(String string){
          return string.replaceAll(" ", "_");
      }
}
