package ocjp;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        IntStream is1 = IntStream.range(1, 3);
        IntStream is2 = IntStream.rangeClosed(1, 3);
        IntStream is3 = IntStream.concat(is1, is2);
        is3.boxed().collect(Collectors.groupingBy(k -> k)).forEach((a, b) -> System.out.println(a + " - " + b));
    }
}
