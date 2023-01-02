package java8.euthuware.euthu8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class GroupingByStream {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Pen", "Stationery", 3.0),
                new Item("Pencil", "Stationery", 2.0),
                new Item("Eraser", "Stationery", 1.0),
                new Item("Milk", "Food", 2.0),
                new Item("Eggs", "Food", 3.0)
        );
        ToDoubleFunction<Item> priceF = Item::getPrice;
        items.stream()
                .collect(Collectors.groupingBy(Item::getCategory))
                .forEach((a, b) -> {
                    double av = b.stream().collect(Collectors.averagingDouble(Item::getPrice));
                    System.out.println(a + " : " + av);
                });
    }
}
