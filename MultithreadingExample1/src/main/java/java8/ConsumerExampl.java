package java8;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExampl {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world");
        Consumer<String> consumer = System.out::println;
        stream.forEach(consumer);
    }
}
