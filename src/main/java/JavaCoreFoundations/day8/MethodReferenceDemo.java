package JavaCoreFoundations.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Function<String, Boolean> f = s -> s.isBlank();
        // Using method references
        Function<String, Boolean> f2 = String::isBlank;

        Supplier<ArrayList<String>> sup = () -> new ArrayList<>();
        // Using method references
        Supplier<ArrayList<String>> sup2 = ArrayList::new;

        Consumer<String> c = s -> System.out.println(s);
        // Using mwethod references
        Consumer<String> c2 = System.out::println;

        Function<Integer, Double> f3 = n -> Math.sqrt(n);
        Function<Integer, Double> f4 = Math::sqrt;
    }
}
