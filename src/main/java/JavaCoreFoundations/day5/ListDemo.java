package JavaCoreFoundations.day5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // adds songs
        arrayList.add("Cancion1");
        arrayList.add("Cancion2");
        arrayList.add("Cancion3");

        linkedList.add("Cancion1");
        linkedList.add("Cancion2");
        linkedList.add("Cancion3");

        // prints both lists
        System.out.println(arrayList);
        System.out.println(linkedList);

        // adds a song in the middle
        arrayList.add(1, "Cancion4");
        linkedList.add(1, "Cancion4");

        // prints after add
        System.out.println(arrayList);
        System.out.println(linkedList);

        // prints the first index of each list
        System.out.println(arrayList.get(1));
        System.out.println(linkedList.get(1));

        // delete a song
        arrayList.remove(1);
        linkedList.remove(1);

        // prints after delete
        System.out.println(arrayList);
        System.out.println(linkedList);

    }
}
