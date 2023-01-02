package java8;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FindFirstUse2 {
    public static void main(String[] args) {
        OptionalDouble temperature = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(temp -> temp > 0)
                .findFirst();
        System.out.println("First matching temparate > 0 is " + temperature.getAsDouble());

        Optional<String> string = Optional.ofNullable(null);
//        System.out.println(string.map(String::length).orElseThrow(IllegalAccessError::new));
        String[] strings = "you never know what you have until you clean your room".split(" ");
        String str = Stream.of(strings).min(String::compareTo).get();
        System.out.println("Min " + str);

        Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();

        String str2 = Stream.of(strings).min(comparator).get();
        System.out.println("Min " + str2);
    }
}
