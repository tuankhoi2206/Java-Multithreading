package java8.euthuware.euthu8;

import java.util.HashMap;
import java.util.Map;

public class BookStore {
    Map<BookTest, Integer> map = new HashMap<>();

    public BookStore() {
        BookTest b = new BookTest("Alll");
        map.put(b, 10);
        b = new BookTest("B222");
        map.put(b, 5);
    }

    Integer getNumberOfCopies(BookTest b) {
        return map.get(b);
    }

    public static void main(String[] args) {
        BookStore bs = new BookStore();
        BookTest b = new BookTest("Alll");
        System.out.println(bs.getNumberOfCopies(b));
        b = new BookTest("B222");
        System.out.println(bs.getNumberOfCopies(b));
    }
}
