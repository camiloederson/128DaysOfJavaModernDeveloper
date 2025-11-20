package JavaCoreFoundations.day9;

import java.util.ArrayList;

public class StreamMethodsDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Marie");
        names.add("Camilo");
        names.add("Camila");
        names.add("Sofia");
        names.add("Fernanda");

        System.out.println(names.stream().filter( (name) -> name.startsWith("C")).toList());
        System.out.println(names.stream().map(String::toUpperCase).toList());
    }
}
