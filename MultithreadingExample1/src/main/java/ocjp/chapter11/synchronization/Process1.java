package ocjp.chapter11.synchronization;

public class Process1 {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Running the produce method...");
            wait();
            System.out.println("Again in the produce method...");
        }
    }
}
