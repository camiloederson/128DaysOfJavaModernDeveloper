package JavaCoreFoundations.day6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapPerformanceGet {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        int elements = 1_000_000;
        int lookups = 100_000;

        for (int i = 0; i < elements; i++) {
            hashMap.put(i, i);
            linkedHashMap.put(i, i);
            treeMap.put(i, i);
        }

        long start, end;
        start = System.currentTimeMillis();
        for (int i = 0; i < lookups; i++) {
            hashMap.get((int) (Math.random() * elements));
        }
        end = System.currentTimeMillis();
        System.out.println("HashMap performance: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < lookups; i++) {
            linkedHashMap.get((int) (Math.random() * elements));
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedHashMap performance: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < lookups; i++) {
            treeMap.get((int) (Math.random() * elements));
        }
        end = System.currentTimeMillis();
        System.out.println("TreeMap performance: " + (end - start) + "ms");
    }
}
