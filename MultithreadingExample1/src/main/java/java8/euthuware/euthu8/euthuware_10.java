package java8.euthuware.euthu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class euthuware_10 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ultimatum", "Thriller"),
                new Book("The Client", "Thriller")
        );
        List<String> genreList = new ArrayList<>();
        books.stream().map(Book::getGenre).forEach(s -> genreList.add(s));
        System.out.println(genreList);
    }
}
