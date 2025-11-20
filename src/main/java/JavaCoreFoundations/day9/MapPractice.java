package JavaCoreFoundations.day9;

import java.util.List;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        List<String> names = List.of("Ana", "Camilo", "Fer", "Sofia", "Daniel");
        System.out.println(names.stream().filter((name) -> name.length() < 5).toList());

        List<Integer> numbers = List.of(3, 4, 10, 15, 22, 7, 8);
        System.out.println(numbers.stream().filter((number) -> number % 2 == 0).toList());

        List<Map<String, Object>> orders = List.of(
                Map.of("total", 50.0,  "status", "PENDING"),
                Map.of("total", 130.0, "status", "PENDING"),
                Map.of("total", 200.0, "status", "DONE"),
                Map.of("total", 180.0, "status", "PENDING")
        );

        System.out.println(orders.stream()
                .filter((order)-> (double) order.get("total") >= 100)
                .filter((order)-> ((String) order.get("status")).equals("PENDING"))
                .toList());
    }
}
