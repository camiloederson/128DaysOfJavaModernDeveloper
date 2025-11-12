package JavaCoreFoundations.day6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {
    public static void main(String[] args) {
        // testing maps
        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        // LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        // TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(1, "Camilo");
        hashMap.put(2, "Berenice");
        hashMap.put(3, "Carmen");

        linkedHashMap.put(1, "Camilo");
        linkedHashMap.put(2, "Berenice");
        linkedHashMap.put(3, "Carmen");

        treeMap.put(1, "Camilo");
        treeMap.put(2, "Berenice");
        treeMap.put(3, "Carmen");
        System.out.println("Printing a HashMap using foreach");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Printing a LinkedHashMap using foreach");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Printing a treeMap using foreach");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
