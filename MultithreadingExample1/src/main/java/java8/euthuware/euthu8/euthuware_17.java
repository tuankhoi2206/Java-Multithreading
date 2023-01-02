package java8.euthuware.euthu8;

import java.time.Instant;
import java.time.LocalDateTime;

public class euthuware_17 {
    public static void main(String[] args) {
        Instant currTimesStamp = Instant.now();
        System.out.println("Instant timestamp is: " + currTimesStamp);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime is: " + localDateTime);
    }
}
