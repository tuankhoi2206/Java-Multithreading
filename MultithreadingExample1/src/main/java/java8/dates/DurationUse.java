package java8.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationUse {
    public static void main(String[] args) {
        Duration d = Duration.ofHours(25);
        System.out.println(d);

        Period p = Period.ofDays(1);
        System.out.println(p);

        Instant now = Instant.now();
        Instant now2 = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(now2);

        d = Duration.ofMillis(1100);
        System.out.println(d);

        d = Duration.ofSeconds(61);
        System.out.println(d);
    }
}
