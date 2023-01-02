package ocjp.chapter11.ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class RecursiveTaskExample {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        SizeOfFileTask system = new SizeOfFileTask("/Users/khoivu/OneDrive/Toeic");
        pool.execute(system);

        do {
            System.out.printf("**************************\n");
            System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
            System.out.printf("Main: Active Threads: %d\n", pool.getActiveThreadCount());
            System.out.printf("Main: Task Count: %d\n", pool.getQueuedTaskCount());
            System.out.printf("Main: Steal Count: %d\n", pool.getStealCount());
            System.out.printf("**************************");
        } while (!system.isDone());
        pool.shutdown();
        System.out.printf("Size of Windows: %d bytes \n", system.join());
//        System.out.printf("Size of Apps: %d bytes \n", apps.join());
//        System.out.printf("Size of Documents: %d bytes \n", documents.join());
    }
}
