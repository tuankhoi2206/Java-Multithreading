package java8;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstUse {
    public static void main(String[] args) {
        Method[] methods = Stream.class.getMethods();
        Optional<String> methodName = Stream.of(methods)
                .map(method -> method.getName())
                .filter(name -> name.endsWith("Match"))
                .sorted()
                .findFirst();
        System.out.println("Result : " + methodName.orElse("No suitable method found"));
    }
}
