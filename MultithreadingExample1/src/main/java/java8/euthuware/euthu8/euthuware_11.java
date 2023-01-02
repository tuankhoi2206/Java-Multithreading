package java8.euthuware.euthu8;

import java.util.stream.DoubleStream;

public class euthuware_11 {
    public static void main(String[] args) {
        DoubleStream is = DoubleStream.of(0, 2, 4);
        double sum = is.filter(i -> i % 2 != 0).sum();
        System.out.println(sum);
    }
}
