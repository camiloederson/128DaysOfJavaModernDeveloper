package JavaCoreFoundations.day8;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<Integer> dice = () -> (int) (Math.random() * 6) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to roll the dices? Y/N");
        String answer = scanner.nextLine();

        while(answer.equalsIgnoreCase("y")){
            System.out.println("Rolling the dices");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("🎲 " +dice.get() + " | " + dice.get());

            System.out.println("Do you want to roll the dices again? Y/N");
            answer = scanner.nextLine();
        }

        System.out.println("Thanks for use this dices roller");
    }
}
