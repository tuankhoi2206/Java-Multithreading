package java8.euthuware;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class euthuware_3 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 47, 33, 23);
        int max = ls.stream().max(Comparator.comparing(a->a)).get();
        System.out.println(max);
    }
}
