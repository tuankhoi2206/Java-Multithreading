package java8.euthuware.euthu8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class euthuware_13 {
    public static void main(String[] args) {
        List<Student> ls = Arrays.asList(
                new Student("S1", Student.Grade.A),
                new Student("S2", Student.Grade.A),
                new Student("S3", Student.Grade.C)
        );

        Map<Student.Grade, List<String>> grouping = ls.stream()
                .collect(Collectors.groupingBy(Student::getGrade,
                        Collectors.mapping(
                                Student::getName,
                                Collectors.toList()
                        )
                ));

        System.out.println(grouping);
    }
}
