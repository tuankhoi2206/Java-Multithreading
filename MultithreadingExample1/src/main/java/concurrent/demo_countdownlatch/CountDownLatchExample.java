package concurrent.demo_countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(3);

        Thread thread1 = new Thread(new ServiceOne(latch));
        Thread thread2 = new Thread(new ServiceTwo(latch));
        Thread thread3 = new Thread(new ServiceThree(latch));

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Waiting for 3 services have started ...");
        latch.await();
        System.out.println("Starting main thread...");
        System.out.println("Done");
    }
}
