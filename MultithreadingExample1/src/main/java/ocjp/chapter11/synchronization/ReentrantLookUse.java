package ocjp.chapter11.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLookUse {
    public int count = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            for (int i = 0; i < 200; i++) {
                count++;
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ReentrantLookUse rtLookUse = new ReentrantLookUse();
        Thread t1 = new Thread(() -> rtLookUse.increment());
        Thread t2 = new Thread(() -> rtLookUse.increment());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(rtLookUse.count);
    }
}
