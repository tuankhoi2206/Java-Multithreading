package section6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

   private int id;

   public Task(int id) {
      this.id = id;
   }

   @Override
   public void run() {
      System.out.println("Task with id:" + id + " is in work - thread id: " + Thread.currentThread().getName());
      long duration = (long) (Math.random() * 5);
      try {
         TimeUnit.SECONDS.sleep(duration);
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
   }
}

public class SingleThreadExcutor {
   public static void main(String[] args) {
      // it isa single Thread that will execute the tasks sequentially
      ExecutorService executorService = Executors.newFixedThreadPool(2);
      for (int i = 0; i < 10; i++) {
         executorService.submit(new Task(i));
      }

      executorService.shutdown();
      //we prevent the executor to execute any further task

      try {
         if (executorService.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
            executorService.shutdownNow();
         }
      } catch (InterruptedException e) {
         executorService.shutdownNow();
      } finally {

      }
   }
}
