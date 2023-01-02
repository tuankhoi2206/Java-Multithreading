package java8.euthuware.euthu8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class euthuware_12 {
    public static void main(String[] args) {
        List<Course> courseList = Arrays.asList(
                new Course("803", "OCAJP 7"),
                new Course("808", "OCAJP 8"),
                new Course("809", "OCPJP 8")
        );
        String list = courseList.stream()
                .filter(c->c.getCategory().indexOf("8")>-1)
                .map(c->c.getId())
                .collect(Collectors.joining("1Z0-"));
        System.out.println(list);
    }
}
