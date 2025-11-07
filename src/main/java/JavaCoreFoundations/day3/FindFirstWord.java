package JavaCoreFoundations.day3;

import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

public class FindFirstWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("🆎 Type the phrase: ");
        String string = scanner.nextLine().trim();
        System.out.println("🚌 The first word of: [" + string + "] is: "+ findFirstWord(string));

    }

    public static String findFirstWord(String string){
        return string.split(" ")[0];
    }
}
