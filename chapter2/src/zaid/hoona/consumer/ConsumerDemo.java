package zaid.hoona.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by zaid on 24/12/15.
 */
public class ConsumerDemo {
    private static List<String> names = Arrays.asList("Alice", "Bony", "Charlie");

    public static void main(String[] args) {
        Consumer<String> consumer = name -> System.out.println("Hello, " + name);
        names.forEach(consumer);
        goodbye();
    }

    public static void goodbye() {
        BiConsumer<String, String> biConsumer = (l, r) -> System.out.println(l + r);
        names.forEach(name -> biConsumer.accept("Goodbye ", name));
    }
}
