package ocjp.chapter11.synchronization;

import java.util.ArrayList;
import java.util.List;

public class CoutingNumber {
    private int upper_limit = 5;
    private int lower_limit = 0;

    private Object lock = new Object();
    private int value = 0;
    private List<Integer> listNumber = new ArrayList<>();

    public void upperNumber() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (listNumber.size() == upper_limit) {
                    System.out.println("Waiting for removing items...");
                    lock.wait();
                } else {
                    System.out.println("Adding : " + value);
                    listNumber.add(value);
                    value++;
                    lock.notify();
                }
                Thread.sleep(1000);
            }
        }
    }

    public void lowerNumber() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (listNumber.size() == lower_limit) {
                    value = 0;
                    System.out.println("Waiting for adding items...");
                    lock.wait();
                } else {
                    System.out.println("Removing : " + listNumber.remove(listNumber.size() - 1));
                    lock.notify();
                }
                Thread.sleep(1000);
            }
        }
    }
}
