package java8;

import java.util.Optional;
import java.util.stream.Stream;

public class StringToUpper {
    public static void main(String[] args) {
        Stream.of("eeny", "meey", null).forEach(StringToUpper::toUpper);
        Optional<String> optional = Optional.of("a");
    }

    private static void toUpper(String str) {
        Optional<String> string = Optional.ofNullable(str);
        System.out.println(string.map(String::toUpperCase).orElse("dummy"));
    }
}
