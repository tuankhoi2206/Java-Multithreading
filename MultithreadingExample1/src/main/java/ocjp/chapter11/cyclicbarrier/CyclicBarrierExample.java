package ocjp.chapter11.cyclicbarrier;

import java.util.Date;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        final CyclicBarrier barrier = new CyclicBarrier(4);
        Thread service1 = new Thread(new ServiceOne(barrier));
        Thread service2 = new Thread(new ServiceTwo(barrier));
        Thread service3 = new Thread(new ServiceThree(barrier));
        System.out.println("Starting both the services at " + new Date());
        service1.start();
        service2.start();
        service3.start();
        try {
            barrier.await();
        } catch (Exception e) {
            System.out.println("Main Thread interrupted!");
            e.printStackTrace();
        }
        System.out.println("Ending both the services at " + new Date());
    }
}
