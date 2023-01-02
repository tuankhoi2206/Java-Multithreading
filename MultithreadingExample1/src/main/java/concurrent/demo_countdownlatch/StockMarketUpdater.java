package concurrent.demo_countdownlatch;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class StockMarketUpdater implements Runnable {
    @Override
    public void run() {
        System.out.println("Updating and downloading stock related data from web....");
    }
}

class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1);
        scheduledThreadPool.scheduleAtFixedRate(new StockMarketUpdater(), 1000, 5000, TimeUnit.MILLISECONDS);
    }
}
