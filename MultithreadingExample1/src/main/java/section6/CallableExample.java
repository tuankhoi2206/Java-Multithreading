package section6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableWorker implements Callable<Integer> {

   private int num;
   private Random random;

   public CallableWorker(int num) {
      this.num = num;
      this.random = new Random();
   }

   @Override
   public Integer call() throws Exception {
      Thread.sleep(random.nextInt(10) * 1000);
      int result = num * num;
      System.out.println("Complete " + result);
      return result;
   }
}

public class CallableExample {

   public static void main(String[] args) {
      List<Future<Integer>> list = new ArrayList<>();
      ExecutorService executorService = Executors.newFixedThreadPool(5);

      Callable<Integer> callable;
      Future<Integer> future;

      for (int i = 0; i < 10; i++) {
         callable = new CallableWorker(i);
         future = executorService.submit(callable);
         list.add(future);
      }

      executorService.shutdown();
      while (!executorService.isTerminated()) {
      }
      int sum = 0;
      for (Future<Integer> integerFuture : list) {
         try {
            sum += integerFuture.get();
         } catch (InterruptedException e) {
            e.printStackTrace();
         } catch (ExecutionException e) {
            e.printStackTrace();
         }
      }
      System.out.println("Finished all threads:" + sum);
   }
}
