package JavaCoreFoundations.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        int age = 0;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e) {
            throw new RuntimeException("Error on the given number", e);
        }
    }
}
