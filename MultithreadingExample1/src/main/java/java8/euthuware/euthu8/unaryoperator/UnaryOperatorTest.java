package java8.euthuware.euthu8.unaryoperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> x * 2;
        Integer result = func.apply(2);

        System.out.println(result);
        UnaryOperator<Integer> func2 = x -> x * 2;
        Integer result2 = func2.apply(2);
        System.out.println(result2);
    }
}
