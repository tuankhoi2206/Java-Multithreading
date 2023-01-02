package ocjp;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyProcessor {
    Integer value;

    public MyProcessor() {
        value = 0;
    }

    public MyProcessor(Integer value) {
        this.value = value;
    }

    public void process() {
        System.out.println(value + " ");
    }

    public static void main(String[] args) {
        Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed();
        values.forEach(System.out::println);
    }
}
