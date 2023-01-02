package java8.euthuware;

import java.util.stream.Stream;

public class euthuware_7 {
    public static void main(String[] args) {
        Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19);
        Stream<Integer> strm2 = strm1.parallel()
                .filter(i -> i > 5)
                .filter(i -> i < 15)
                .sequential();
        strm2.forEach(System.out::println);

    }
}
