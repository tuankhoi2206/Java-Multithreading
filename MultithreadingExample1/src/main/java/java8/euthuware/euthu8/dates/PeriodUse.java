package java8.euthuware.euthu8.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodUse {
    public static void main(String[] args) {
        Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);

//        Duration d = Duration.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
//        System.out.println(d);

        Duration d1 = Duration.ofHours(25);
        System.out.println(d1);

        Period p1= Period.ofDays(1);
        System.out.println(p1);
    }
}
