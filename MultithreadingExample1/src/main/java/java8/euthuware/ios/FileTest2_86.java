package java8.euthuware.ios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class FileTest2_86 {
    public static void main(String[] args) throws FileNotFoundException {
        Stream<String> ref = new BufferedReader(
                new FileReader("/Users/khoivu/OneDrive/Java8/enthuware.txt"))
                .lines();
        ref.forEach(System.out::println);
    }
}
