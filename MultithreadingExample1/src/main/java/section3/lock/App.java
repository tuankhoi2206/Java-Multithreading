package section3.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker {
   private Lock lock = new ReentrantLock();
   private Condition condition = lock.newCondition();

   public void producer() throws InterruptedException {
      lock.lock();
      System.out.println("Producer method...");
      condition.await();
      System.out.println("Producer again...");
      lock.unlock();
   }

   public void consumer() throws InterruptedException {
      lock.lock();
      Thread.sleep(800);
      System.out.println("Consumer method...");
      condition.signal();
      lock.unlock();
   }
}

public class App {
   private static int counter = 0;
   private static Lock lock = new ReentrantLock();

   public static void increment() {
      lock.lock();
      for (int i = 0; i < 500; i++) {
         counter++;
      }
      lock.unlock();
   }

   public static void main(String[] args) throws InterruptedException {
      Thread thread1 = new Thread(() -> increment());

      Thread thread2 = new Thread(() -> increment());

      thread1.start();
      thread2.start();

      thread1.join();
      thread2.join();

//      System.out.println("Counter :" + counter);
   }
}
