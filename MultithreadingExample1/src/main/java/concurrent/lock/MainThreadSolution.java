package concurrent.lock;

/**
 * @author : Khoi vu
 * @created : 6/7/24, Saturday
 * @Description:
 **/
public class MainThreadSolution {

    public static int counter1 = 0;
    public static int counter2 = 0;

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    /**
     * usually it is not a good practice to use synchronized keyword
     * Anyways, whenever the first thread acquires the lock of the given class, then the second thread has
     * to wait for the first thread to release the lock, despite the fact that these are totally independent
     */
    public static void incrementCounter1() {
        synchronized (lock1) {
            counter1++;
        }
    }

    public static void incrementCounter2() {
        synchronized (lock2) {
            counter2++;
        }
    }

    public static void process() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 1 has :" + counter1);
                incrementCounter1();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 2 has :" + counter2);
                incrementCounter2();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The counter is: " + counter1);
    }

    public static void main(String[] args) throws InterruptedException {
        process();
    }
}
