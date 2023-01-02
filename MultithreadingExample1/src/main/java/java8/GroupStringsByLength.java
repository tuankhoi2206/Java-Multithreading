package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupStringsByLength {
    public static void main(String[] args) {
        String[] strings = "you never know what you have until you clean your room".split(" ");
        Stream<String> distinctWords = Arrays.stream(strings).distinct();
//        System.out.println("Initial words");
//        distinctWords.forEach(System.out::println);
        Map<Integer, List<String>> wordsGroup = distinctWords.collect(Collectors.groupingBy(String::length));
        wordsGroup.forEach((count, words) -> {
            System.out.printf("word(s) of length %d %n", count);
            words.forEach(System.out::println);
        });
    }
}
