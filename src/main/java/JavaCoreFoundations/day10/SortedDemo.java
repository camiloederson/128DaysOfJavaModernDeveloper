package JavaCoreFoundations.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {
        Supplier<List<Integer>> list = () -> {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10 ; i++) {
                numbers.add((int)(Math.random() * 10 + 1));
            }
            return numbers;
        };

        List<Integer> randomList = list.get();
        System.out.println("Random list: " + randomList);
        System.out.println("Sorted list " + list.get().stream().sorted().toList());

    }

}
