package java8.euthuware.euthu8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class euthuware_18 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(2, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().max((a, b) -> a > b ? a : b).get());

        DoubleStream is = DoubleStream.of(0, 2, 4, 3);
        double sum = is.filter(i -> i % 2 != 0).sum();
        System.out.println(sum);

    }
}
