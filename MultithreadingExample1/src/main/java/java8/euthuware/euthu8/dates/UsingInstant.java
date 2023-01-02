package java8.euthuware.euthu8.dates;

import java.time.Instant;
import java.time.LocalDateTime;

public class UsingInstant {
    public static void main(String[] args) {
        Instant currTimeStamp = Instant.now();
        System.out.println("Instant timmestamp is: " + currTimeStamp);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime is: " + localDateTime);
    }
}
