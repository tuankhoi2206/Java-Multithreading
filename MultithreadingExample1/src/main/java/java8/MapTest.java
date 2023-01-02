package java8;

import java.util.function.Function;
import java.util.stream.Stream;

public class MapTest {
    public static void main(String[] args) {
        Function<Integer, Integer> funcMul = i -> i * i;
        long count = Stream.of(1, 3, 4, 6, 7).map(funcMul).peek(i -> System.out.printf("%d ", i)).count();
        System.out.printf("The stream has %d element", count);
    }
}
