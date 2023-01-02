package ocjp.chapter11.synchronization;

public class Process2 {
    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        synchronized (this) {
            System.out.println("Consume method is executed...");
            notify();
        }
    }
}
