package java8.euthuware.euthu8.suppliers;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());
    }
}
