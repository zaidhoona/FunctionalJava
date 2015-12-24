package zaid.hoona.curry;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by zaid on 24/12/15.
 */
public class CurryDemo {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        Function<String, Function<String, String>> curriedConcat = curry(concat);
        for (String name : Arrays.asList("Hello, ", "Whats up!, ", "Hi ")) {
            greetFolks(curriedConcat.apply(name));
        }
    }

    public static void greetFolks(Function<String, String> greeter) {
        for (String name : Arrays.asList("Alice", "Brandy", "Chester")) {
            System.out.println(greeter.apply(name));
        }
    }

    public static <T, U, V> Function<T, Function<U, V>> curry(BiFunction<T, U, V> bif) {
        return t -> (u -> bif.apply(t, u));
    }
}
