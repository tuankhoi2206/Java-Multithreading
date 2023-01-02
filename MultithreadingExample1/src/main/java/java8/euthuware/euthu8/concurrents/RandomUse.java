package java8.euthuware.euthu8.concurrents;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUse {
    public static void main(String[] args) {
        int r = ThreadLocalRandom.current().nextInt(1, 11);
        System.out.println(r);
    }
}
