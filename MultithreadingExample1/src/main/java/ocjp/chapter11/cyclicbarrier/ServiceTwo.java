package ocjp.chapter11.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ServiceTwo implements Runnable {

    private final CyclicBarrier cyclicBarrier;

    public ServiceTwo(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("Starting Service One...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Service Two has finished its work.");
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            System.out.println("Service Two has finished its work");
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("Service Two interrupted!!");
            e.printStackTrace();
        }
        System.out.println("The wait it over, lets complete Service Two!!");
    }
}
