package time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        LocalDateTime ld1= LocalDateTime.of(2015,Month.NOVEMBER,1,2,0);
        ChronoUnit.HOURS.between(ld1, ld1);
    }
}
