package section3;

import java.util.ArrayList;
import java.util.List;

class Processer {

   public static final int UPPER_LIMIT = 5;
   public static final int LOWER_LIMIT = 0;
   private List<Integer> list = new ArrayList<>();

   private final Object lock = new Object();
   private int value = 0;

   public void producer() throws InterruptedException {
      synchronized (lock) {
         while (true) {
            if (list.size() == UPPER_LIMIT) {
               System.out.println("Waiting for removing items...");
               lock.wait();
            } else {
               System.out.println("Adding :" + value);
               list.add(value);
               value++;
               lock.notify();
            }
            Thread.sleep(500);
         }
      }
   }

   public void consumer() throws InterruptedException {
      synchronized (lock) {
         while (true) {
            if (list.size() == LOWER_LIMIT) {
               value = 0;
               System.out.println("Waiting for adding items...");
               lock.wait();
            } else {
               System.out.println("Removing :" + list.remove(list.size() - 1));
               lock.notify();
            }
            Thread.sleep(500);
         }
      }
   }
}

public class App {
   public static void main(String[] args) {

      Processer processer = new Processer();
      Thread thread1 = new Thread(() -> {
         try {
            processer.producer();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      });

      Thread thread2 = new Thread(() -> {
         try {
            processer.consumer();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      });

      thread1.start();
      thread2.start();
   }
}
