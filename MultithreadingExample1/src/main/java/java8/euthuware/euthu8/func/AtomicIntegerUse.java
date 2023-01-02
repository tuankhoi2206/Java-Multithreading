package java8.euthuware.euthu8.func;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtomicIntegerUse {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        Stream<Integer> stream = Stream.of(11, 11, 22, 33).parallel();
        List<Integer> in = stream.filter(e -> {
            ai.incrementAndGet();
            return e % 2 == 0;
        }).collect(Collectors.toList());
        in.forEach(System.out::println);
        System.out.println(ai);

        List<String> vals = Arrays.asList("a", "b");
        String join = vals.parallelStream().reduce("_",
                (a, b) -> a.concat(b));
        System.out.println(join);
    }
}
