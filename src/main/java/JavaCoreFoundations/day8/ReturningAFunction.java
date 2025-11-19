package JavaCoreFoundations.day8;

import java.util.function.Function;

public class ReturningAFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> timesFive = multiplier(5);
        System.out.println(timesFive.apply(10));

        Function<Integer, Integer> timesTen = multiplier(10);
        System.out.println(timesTen.apply(10));

    }

    public static Function<Integer, Integer> multiplier(int factor){
        return (num) -> num * factor;
    }
}
