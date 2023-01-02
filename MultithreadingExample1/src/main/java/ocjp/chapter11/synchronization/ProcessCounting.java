package ocjp.chapter11.synchronization;

public class ProcessCounting {
    public static void main(String[] args) {

        CoutingNumber coutingNumber = new CoutingNumber();

        Thread t1 = new Thread(() -> {
            try {
                coutingNumber.upperNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                coutingNumber.lowerNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
