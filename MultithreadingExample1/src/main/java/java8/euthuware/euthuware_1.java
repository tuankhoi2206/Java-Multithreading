package java8.euthuware;

import java8.Book;

import java.util.Arrays;
import java.util.List;

public class euthuware_1 {
    public static void main(String[] args) {
        List<List<Book>> books= Arrays.asList(
                Arrays.asList(
                        new Book("Wind", 7.0),
                        new Book("Tell me your dream", 9.0)
                ),
                Arrays.asList(
                        new Book("There is a hippy on the highway", 5.0),
                        new Book("Easy come easy go", 5.0)
                )
        );
        double d = books.stream().
                flatMap(bs -> bs.stream()).mapToDouble(bs->bs.getPrice()).sum();
        System.out.println(d);
    }
}
