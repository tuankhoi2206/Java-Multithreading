package java8;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MatchUse_2 {
    public static void main(String[] args) {
        IntStream temperatures = IntStream.of(-5, -6, -7, -5, 2, -8, -9);
        IntPredicate positiveTemperatures = temp -> temp > 0;
        if (temperatures.anyMatch(positiveTemperatures)) {
            int temp = temperatures.filter(positiveTemperatures).findFirst().getAsInt();
            System.out.println(temp);
        }
    }
}
