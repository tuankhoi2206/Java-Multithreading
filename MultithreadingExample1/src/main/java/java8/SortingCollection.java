package java8;

import java.util.Arrays;
import java.util.List;

public class SortingCollection {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("follow your heart but take your bain with you".split(" "));
        words.stream().distinct().sorted().forEach(System.out::println);
    }
}
