package zaid.hoona.binaryandunary;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Created by zaid on 24/12/15.
 */
public class BinaryAndUnaryDemo {
    public static void main(String[] args) {
        BinaryOperator<String> concat = (left, right) -> left + right;
        UnaryOperator<String> uppercase = String::toUpperCase; //String::toUpperCase
        UnaryOperator<String> lowercase = String::toLowerCase; //String::toLowerCase

        System.out.println(concat.apply(uppercase.apply("hello "), lowercase.apply("WORLD")));
    }
}
