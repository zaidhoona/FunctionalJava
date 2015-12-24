package zaid.hoona.greeter;

import java.util.function.Function;

/**
 * Demo greeting using lambda
 *
 * Created by zaid on 24/12/15.
 */
public class GreeterDemo {
    public static void main(String[] args) {
        String greeting = "Hello, ";

        // Using custom interface
        Greeter greeter = whom -> greeting + whom + "!";
        greetWorld(greeter);

        // Using Function class
        Function<String, String> greeterFunction = whom -> greeting + whom + "!";
        greetSam(greeterFunction);
    }

    public static void greetWorld(Greeter greeter) {
        System.out.println(greeter.createGreeting("World"));
    }

    public static void greetSam(Function<String, String> greeter) {
        System.out.println(greeter.apply("Sam"));
    }
}
