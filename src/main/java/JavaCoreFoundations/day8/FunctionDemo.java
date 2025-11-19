package JavaCoreFoundations.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, String> pluralize = (noun) -> {
            return noun.endsWith("s") ? noun + "es" : noun+"s";
        };

        System.out.println(makePlural("bus", pluralize));

    }

    public static String makePlural(String noun, Function<String, String> pluralize){
        return pluralize.apply(noun);
    }

}


