package section3;

public class Process {
   public void produce() throws InterruptedException {
      synchronized (this) {
         System.out.println("Running the produce method ...");
         wait();
         System.out.println("Again in the producer method ...");
      }
   }

   public void consume() throws InterruptedException {
      Thread.sleep(1000);
      synchronized (this) {
         System.out.println("Consume method is executed...");
         notify();
         Thread.sleep(5000);
      }
   }
}
