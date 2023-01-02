package java8;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorToTreeSet {
    public static void main(String[] args) {
        Set<String> set = Stream.of("a rose is a rose is a rose".split(" "))
                .collect(Collectors.toCollection(TreeSet::new));
        set.forEach(System.out::println);
    }
}
