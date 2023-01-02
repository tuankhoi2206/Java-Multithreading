package ocjp.chapter11.synchronization;

public class JoinThreadUse {
    public static int counter1 = 0;
    public static int counter2 = 0;

    public void count1() {
        synchronized (this) {
            counter1++;
        }
    }

    public void count2() {
        synchronized (this) {
            counter2++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        JoinThreadUse joinThreadUse1 = new JoinThreadUse();
        JoinThreadUse joinThreadUse2 = new JoinThreadUse();

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1");
                joinThreadUse1.count1();
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 2");
                joinThreadUse1.count2();
            }
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();
        System.out.println("Counter 1: " + joinThreadUse1.counter1);
        System.out.println("Counter 2: " + joinThreadUse2.counter2);
    }
}
