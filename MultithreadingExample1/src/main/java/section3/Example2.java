package section3;

import com.sun.org.apache.xalan.internal.res.XSLTErrorResources_ja;

public class Example2 {

   private static Integer count = 0;

   public static synchronized void increase() {
      count++;
   }

   public static void increase_obj_level_lock() {
      synchronized (Example2.class) {
         count++;
      }
   }

   public static void process() {
      Thread thread1 = new Thread(() -> {
         for (int i = 0; i < 100; i++) {
            //increase();
            increase_obj_level_lock();
         }
         System.out.println("Runner 1:" + count);
      });

      Thread thread2 = new Thread(() -> {
         for (int i = 0; i < 100; i++) {
            //increase();
            increase_obj_level_lock();
         }
         System.err.println("Runner 2:" + count);
      });

      thread1.start();
      thread2.start();

      try {
         thread1.join();
         thread2.join();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      System.out.println("Count: " + count);
   }

   public static void main(String[] args) {
      process();
   }
}
