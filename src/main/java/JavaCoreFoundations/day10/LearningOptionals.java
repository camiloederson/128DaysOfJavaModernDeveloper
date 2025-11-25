package JavaCoreFoundations.day10;

import java.util.Optional;

public class LearningOptionals {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Camilo");
        System.out.println(name.map((n) -> n.toUpperCase()));
        System.out.println(name.filter(n -> n.length() > 5));
        System.out.println(name.flatMap((n) -> Optional.of(n.length())));
    }
}
