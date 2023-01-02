package java8.euthuware.euthu8;

import java.time.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByUse {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("greg", "dave", "don", "ed", " fred");
        Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()
        ));
        System.out.println(data.values());

        LocalDateTime ld = LocalDateTime.of(2021, Month.OCTOBER, 31, 10, 0);
        ZonedDateTime dateTime = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));

        dateTime.plus(Duration.ofDays(1));
        System.out.println(dateTime);
    }
}
