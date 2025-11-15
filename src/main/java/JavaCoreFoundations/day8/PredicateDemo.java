package JavaCoreFoundations.day8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> string = (s) -> s.startsWith("A");
        Predicate<Integer> isEven = (num) -> num % 2 == 0 ;
        Predicate<Integer> isAdult = (age) -> age >=18;
        Predicate<Double> isApproved = grade -> grade >=6.0;

        System.out.println("Testing Predicate");
        System.out.println("Does Armando start with 'A'? " + (string.test("Armando") ? " ✅ " : " ❌ "));
        System.out.println("Is 8 even? " + (isEven.test(8) ? " ✅ " : " ❌ "));
        System.out.println("Is 17 an 'Adult Age'? " + (isAdult.test(17) ? " ✅ " : " ❌ "));
        System.out.println("Is 7 an 'Approved Grade'? " + (isApproved.test(7.0) ? " ✅ " : " ❌ "));
    }
}
