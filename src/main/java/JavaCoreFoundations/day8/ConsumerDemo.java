package JavaCoreFoundations.day8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Double, Double> sum = (num1, num2) ->
                System.out.println(num1+num2);

        sum.accept(11.5, 22.0);
    }
}
