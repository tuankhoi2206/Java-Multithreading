package java8;

import java.util.stream.Stream;

public class MatchUse {
    public static void main(String[] args) {
        boolean anyMatch = Stream.of(-56, -67, -55, -48, -51, 1).anyMatch(temp -> temp > 0);
        System.out.println("anyMath(temp -> temp > 0) " + anyMatch);
    }
}