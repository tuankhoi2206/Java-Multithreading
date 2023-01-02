package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLengththenNatural {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));
        Comparator<String> stringComparator = (s1, s2) -> s1.length() - s2.length();
        words.stream().distinct().sorted(stringComparator.thenComparing(String::compareTo)).forEach(System.out::println);
    }
}
