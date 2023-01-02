package ocjp.chapter11.synchronization;

public class TestProcess {
    public static void main(String[] args) {
        Process1 process1 = new Process1();
        Process2 process2 = new Process2();

        Thread t1 = new Thread(() -> {
            try {
                process1.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                process2.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
