package java8.euthuware.euthu8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class euthuware_9 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("B Java core II", "Bracle"),
                new Book("A Java core I", "Oracle")
        );
        Comparator<Book> c1 = (b1, b2) -> b1.getGenre().compareTo(b2.getGenre());
        books.stream().sorted(c1.thenComparing(Book::getTitle));
        System.out.println(books);
    }
}
