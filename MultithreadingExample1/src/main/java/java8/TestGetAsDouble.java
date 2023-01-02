package java8;

import java.util.function.DoubleSupplier;

public class TestGetAsDouble {
    public static void main(String[] args) {
        Book b1 = new Book("Java in 24 hrs", null);
        DoubleSupplier ds1 = b1::getPrice;
        System.out.println(b1.getTitle() + " " + ds1.getAsDouble());
    }
}
