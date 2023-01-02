package java8.euthuware.euthu8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class euthuware_8 {
    public static void main(String[] args) {
        List<Course> s1 = Arrays.asList(
                new Course("OCAJP", "Java"),
                new Course("OCPJP", "Java"),
                new Course("C#", "C#"),
                new Course("OCEJPa", "Java")
        );
        s1.stream().collect(Collectors.groupingBy(c -> c.getCategory()))
                .forEach((m, n) -> System.out.println(n));
        String test ="aaa";
        StringBuilder sb= new StringBuilder(test);

    }
}
