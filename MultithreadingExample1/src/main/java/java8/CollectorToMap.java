package java8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorToMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Stream.of("Arnoth", "Alois", "Schwarzenegger").collect(Collectors.toMap(name -> name, name -> name.length()));
        map.forEach((name, value) -> System.out.println(name + " " + value));
    }
}
