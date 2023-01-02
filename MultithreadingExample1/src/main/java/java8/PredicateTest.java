package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest {

    public static class Book {
        private String title;
        private Double price;

        public Book(String title, Double price) {
            this.title = title;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", 5.0),
                new Book("Gone with the wind 1", 10.0),
                new Book("Atlas Shrugged", 15.0)
        );

        books.stream().collect(Collectors.toMap((b -> b.getTitle()), (b -> b.getPrice()))).forEach((a, b) -> System.out.println(a + " " + b));
    }
}