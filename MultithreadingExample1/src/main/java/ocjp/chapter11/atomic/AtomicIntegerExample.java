package ocjp.chapter11.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(() -> {
            increment();
        });

        Thread th2 = new Thread(() -> {
            increment();
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();
        System.out.println("Counter: " + atomicInteger.get());
    }

    private static void increment() {
        for (int i = 0; i < 10000; i++) {
            atomicInteger.incrementAndGet();
        }
    }

}
