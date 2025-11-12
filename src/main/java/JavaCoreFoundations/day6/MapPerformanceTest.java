package JavaCoreFoundations.day6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapPerformanceTest {
    public static void main(String[] args) {
        int elements = 1_000_000;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            hashMap.put(i, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Hashmap: " + (end - start) + "ms.");

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            linkedHashMap.put(i, i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedHashMap: " + (end - start) + "ms");

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            treeMap.put(i, i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeMap: " + (end - start) + "ms");
    }
}
