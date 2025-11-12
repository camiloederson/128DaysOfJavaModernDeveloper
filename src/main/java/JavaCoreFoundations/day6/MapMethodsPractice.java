package JavaCoreFoundations.day6;

import jdk.dynalink.beans.StaticClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMethodsPractice {
    static HashMap<Integer, String> students = new HashMap<>();
    static int studentsCounter = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        addStudents();
        printKeys();
        printValues();
        printEntries();
        findById();
        removeById();
        updateNames();
        printingUpdatedValues();
    }

    public static void addStudents() {
        String flag = "Y";
        while (flag.equalsIgnoreCase("y")) {
            System.out.print("Add the student's name");
            students.put(studentsCounter++, scanner.nextLine());
            System.out.println("Would you like to add a student? Y/N");
            flag = scanner.nextLine();
        }
    }
    public static void printKeys(){
        System.out.println("Printing keys");
        for (int element : students.keySet()){
            System.out.println(element);
        }
    }
    public static void printValues(){
        System.out.println("printing values");
        for (String element : students.values()){
            System.out.println(element);
        }
    }
    public static void printEntries(){
        System.out.println("Printing entries");
        for (Map.Entry<Integer, String> element : students.entrySet()){
            System.out.println("🖥️ " + element.getKey() + "\t 🟰 " + element.getValue());
        }
    }
    public static void findById(){
        System.out.println("🔍 Find By Id");
        System.out.println("Enter the id: ");
        int id = scanner.nextInt();
        if (students.containsKey(id)){
            System.out.println("Name: " + students.get(id));
        }
        else System.out.println("The name doesn't exist");
    }
    public static void removeById(){
        System.out.println("❌ Enter the id to remove");
        int id = scanner.nextInt();
        students.remove(id);
        printEntries();

    }

    public static void updateNames(){
        for (Map.Entry<Integer, String> element : students.entrySet()){
            element.setValue(element.getValue() + " active");
        }
    }

    public static void printingUpdatedValues(){
        for (Map.Entry<Integer, String> element : students.entrySet()){
            System.out.println(element);
        }
    }
}
