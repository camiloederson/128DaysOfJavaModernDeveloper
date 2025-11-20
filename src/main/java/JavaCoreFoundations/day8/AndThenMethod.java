package JavaCoreFoundations.day8;

import java.util.function.Function;

public class AndThenMethod {
    public static void main(String[] args) {

        Function<String, String> trim = (s) -> s.trim();
        Function<String, String> upperCase = (s) -> s.toUpperCase();
        Function<String, String> sentenceMaker = (s) -> s + "!!! has been trimmed and uppercased";

        System.out.println(trim.andThen(upperCase).andThen(sentenceMaker).apply("    gooooooool    "));
    }


}
