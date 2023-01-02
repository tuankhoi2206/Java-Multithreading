package java8.euthuware;

public class TestClass implements Runnable {

    int x = 0, y = 0;

    @Override
    public void run() {
        while (true) {
            x++;
            y++;
            System.out.println(Thread.currentThread().getName() + "x= " + x + " ,y= " + y);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        new Thread(tc).start();
        new Thread(tc).start();
    }
}
