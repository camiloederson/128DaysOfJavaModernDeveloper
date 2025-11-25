package JavaCoreFoundations.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TerminalOperations {
    public static void main(String[] args) {
        Supplier<List<Integer>> listOfIntegers = () -> {
                List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                integers.add((int) (Math.random() * 100 + 1));
            }

            return integers;
        };

        Supplier<List<Integer>> list = () -> {
            int index = (int) (Math.random() * 100 + 1);
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < index; i++) {
                integers.add((int) (Math.random() * 100 + 1));
            }
            return integers;
        };

        printingList(listOfIntegers);
        System.out.println("🖥️ The second list contains: " + countingList(list) + " elements");
        }

        public static void printingList(Supplier<List<Integer>> listSupplier){
            List<Integer> list = listSupplier.get();
            list.stream().sorted().forEach(System.out::println);
        }

        public static long countingList(Supplier<List<Integer>> list){
            return  list.get().stream().count();
        }
    }
