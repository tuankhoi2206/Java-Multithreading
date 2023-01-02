package java8.euthuware.euthu8.streams;

import java8.Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamUse1 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", 5.0),
                new Book("Gone with the wind", 10.0),
                new Book("Atlas Shruggred", 15.0)
        );
//        books.stream().collect(Collectors.toMap(b -> b.getTitle(),
//                        b -> b.getPrice()))
//                .forEach((a, b) -> System.out.println(a + " " + b));

        List<Double> dList = Arrays.asList(10.0, 12.0);
        dList.stream().forEach(x -> {
            x = x + 10;
        });
//        dList.stream().forEach(System.out::print);

        Double d = new Double(5);
        d += 10;
        System.out.println(d);
    }
}
