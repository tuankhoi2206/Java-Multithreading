package java8;

import java.util.stream.Stream;

public class FunctionUse {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a, b, c".split(",")).map(String::toUpperCase);
        stream.forEach(System.out::println);

    }
}
