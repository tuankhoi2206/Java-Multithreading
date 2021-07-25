package section3;

class Runner1 implements Runnable {
   public void execute() {
      for (int i = 0; i < 10; i++) {
         try {
            Thread.sleep(200);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         System.out.println(this.getClass() + " : " + i);
      }
   }

   @Override
   public void run() {
      execute();
   }
}

class Runner2 implements Runnable {
   public void execute() {
      for (int i = 0; i < 10; i++) {
         try {
            Thread.sleep(200);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         System.out.println(this.getClass() + " : " + i);
      }
   }

   @Override
   public void run() {
      execute();
   }
}

public class Section3Example {
   public static void main(String[] args) {
      Thread thread1 = new Thread(new Runner1());
      Thread thread2 = new Thread(new Runner2());
      thread1.start();
      thread2.start();
   }
}
