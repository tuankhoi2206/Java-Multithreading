package concurrent.demo1;

import java.util.ArrayList;
import java.util.List;

public class Processor {
    private List<Integer> list = new ArrayList<>();
    private static final int UPPER_LIMIT = 5;
    private static final int LOWER_LIMIT = 0;
    private int value = 0;
    private final Object lock = new Object();

    public void producer() throws InterruptedException {
        synchronized (lock) {
            for (; ; ) {
                Thread.sleep(1000);
                if (list.size() == UPPER_LIMIT) {
                    System.out.println("Waiting for removing items ...");
                    lock.wait();
                } else {
                    System.out.println("Adding: " + value);
                    list.add(value++);
                    lock.notify();
                }
            }
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (lock) {
            for (; ; ) {
                Thread.sleep(1000);
                if (list.size() == LOWER_LIMIT) {
                    System.out.println("Waiting for adding items ...");
                    value = 0;
                    lock.wait();
                } else {
                    System.out.println("Removing: " + list.remove(list.size() - 1));
                    lock.notify();
                }
            }
        }
    }

    public static void main(String[] args) {

        Processor processor = new Processor();

        new Thread(() -> {
            try {
                processor.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                processor.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
