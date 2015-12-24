package zaid.hoona.partial;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by zaid on 24/12/15.
 */
public class PartialDemo {
    public static void main(String[] args) {

        // Implicit Partial Function
        System.out.println("Implicit Partial Function");
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        greetFolks(whom -> concat.apply("Hello, ", whom));
        System.out.println();

        System.out.println("Explicit Partial Function");
        greetFolks(applyPartial(concat, "Hello, "));
    }

    public static <T, U, V> Function<U, V> applyPartial(BiFunction<T, U, V> bif, T firstArgument) {
        return t -> bif.apply(firstArgument, t);
    }

    public static void greetFolks(Function<String, String> greeter) {
        for (String name : Arrays.asList("Alice", "Brandy", "Chester")) {
            System.out.println(greeter.apply(name));
        }
    }
}
