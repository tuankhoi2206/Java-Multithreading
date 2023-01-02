package concurrent;

public class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world from a given thread...");
    }

    public static void main(String[] args) {
        Thread t1= new Thread(new Worker());
        t1.setName("Thread 1");
        t1.setDaemon(true);

        Thread t2 = new Thread(new Worker());
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
