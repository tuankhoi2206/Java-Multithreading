package java8;

import java.util.stream.Stream;

public class PredicateExampl {
    public static void main(String[] args) {
        Stream.of("hello", "world").filter(w -> w.startsWith("h")).forEach(System.out::println);
    }
}
