package JavaCoreFoundations.day10;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class LearningOptionals {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Camilo");
        System.out.println(name.map((n) -> n.toUpperCase()));
        System.out.println(name.filter(n -> n.length() > 5));
        System.out.println(name.flatMap((n) -> Optional.of(n.length())));

        Optional<String> user = Optional.empty();
        // Gonna print that the user doesn't exist
        System.out.println(userExists(user) ? "User exists" : "User does not exist");
        user = Optional.of("Camilo Castro");
        System.out.println(userExists(user) ? "User exists. " + user.get() : "User does not exist");

        // Let's try with .toSet()
        System.out.println("Let's try with .toSet()");
        List<Integer> nums = List.of(10, 20, 10, 30, 20, 40);
        System.out.println(produceSet(nums));

        List<String> names = List.of("Ana", "Luis", "Camilo");
        System.out.println(names.stream().collect(Collectors.joining(",")));
    }

    public static boolean userExists(Optional<String> user){
        return user.isPresent();
    }

    public static Set<Integer> produceSet(List<Integer> list){
        return list.
                stream().
                collect(Collectors.toSet());
    }
}
