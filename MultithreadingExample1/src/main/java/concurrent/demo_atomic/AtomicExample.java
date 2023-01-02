package concurrent.demo_atomic;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicExample {
    private AtomicBoolean active = new AtomicBoolean(false);

    public static void main(String[] args) throws Exception {
        AtomicExample example = new AtomicExample();
        example.prepare();
        example.start();
    }

    public void prepare() {
        new Thread(() -> {
            System.out.println("application preparing ...");
            try {
                sleep(3);
                active.set(true);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    public void start() throws Exception {
        new Thread(() -> {
            while (!active.get()) {
                System.out.println("application started");
            }
        }).start();
    }

    public void sleep(int second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }
}

