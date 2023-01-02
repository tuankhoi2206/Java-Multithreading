package java8;

import java.util.stream.Stream;

public class AllMatch {
    public static void main(String[] args) {
        boolean result = Stream.of("do", "re", "mi", "fa", "so", "la", "ti")
                .filter(str -> str.length() > 5)
                .peek(System.out::println)
                .allMatch(str -> str.length() > 5);
        System.out.println(result);
    }
}