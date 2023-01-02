package java8;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionToSet {
    public static void main(String[] args) {
        String[] useQuote = "a rose is a rose is rose".split(" ");
        Set<String> words = Stream.of(useQuote).collect(Collectors.toSet());
        words.forEach(System.out::println);
    }
}
