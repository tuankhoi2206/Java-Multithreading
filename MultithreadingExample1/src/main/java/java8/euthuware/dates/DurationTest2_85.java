package java8.euthuware.dates;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest2_85 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2017, 12, 02, 6, 0, 0);
        LocalDateTime ldtNew = LocalDateTime.of(2017, 12, 02, 9, 0, 0);
        Duration d = Duration.between(ldtNew, ldt);
        System.out.println(d);

    }
}
