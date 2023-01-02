package concurrent.demo_countdownlatch;

import java.util.concurrent.CountDownLatch;

public class ServiceTwo implements Runnable {

    private final CountDownLatch latch;

    public ServiceTwo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Started service two");
        latch.countDown();
    }
}
