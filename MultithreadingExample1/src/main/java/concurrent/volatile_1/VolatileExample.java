package concurrent.volatile_1;

public class VolatileExample {
    private volatile boolean active;

    public static void main(String[] args) throws Exception {
        VolatileExample example = new VolatileExample();
        example.prepare();
        example.start();
    }

    public void prepare() {
        new Thread(() -> {
            System.out.println("application preparing ...");
            try {
                sleep(3);
                active = true;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    public void start() throws Exception {
        new Thread(() -> {
            while (!active) {
                System.out.println("active " + active);
                System.out.println("application started");
            }
        }).start();
    }

    public void sleep(int second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }
}
