package section3;

public class WaitAndNotify {
   public static void main(String[] args) {
      ThreadB threadB = new ThreadB();
      threadB.start();

      synchronized (threadB) {
         System.out.println("Waiting for threadB to compile...");
         try {
            threadB.wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         System.out.println("Total is :" + threadB.total);
      }
   }
}

class ThreadB extends Thread {

   int total;

   @Override
   public void run() {
      synchronized (this) {
         for (int i = 0; i < 100; i++) {
            total += i;
         }
         notify();
      }
   }
}
