package JavaCoreFoundations.day4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){
        String[] names = fillArray();
        Scanner scanner = new Scanner(System.in);
        System.out.print("🆎 Type the name to search: ");
        String name = scanner.nextLine();
        int index = searchName(name, names);
        System.out.println(index!=-1 ? "✅ Found in index " + index : "❌ Not found");
    }

    public static String[] fillArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("🔢 How many names do you need to enter: ");
        int namesSize = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[namesSize];
        int counter = 0;

        while (counter < namesSize){
            System.out.print("✍️ Type the name " + (counter + 1) + ": ");
            names[counter] = scanner.nextLine();
            counter++;
        }
        return names;
    }

    public static int searchName(String name, String[] names){
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) return i;
        }
        return -1;
    }
}
