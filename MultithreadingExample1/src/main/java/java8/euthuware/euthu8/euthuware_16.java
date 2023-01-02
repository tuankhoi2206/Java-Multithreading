package java8.euthuware.euthu8;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class euthuware_16 {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("j", "a", "v", "a");
        UnaryOperator<String> uo = str -> str.toUpperCase();
        letters.replaceAll(uo);
        letters.forEach(System.out::println);
    }
}