package java8.euthuware.euthu8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class euthuware_1 {
    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<>();
        source.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> destination = Collections.synchronizedList(new ArrayList<>());
        source.stream()
                .peek(item -> {
                    destination.add(item);
                })
                .forEachOrdered(System.out::print);
        System.out.println("");
        destination.stream().forEach(System.out::print);
    }
}
