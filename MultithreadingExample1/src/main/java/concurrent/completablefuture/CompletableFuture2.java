package concurrent.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static java.lang.System.*;

/**
 * @author : root
 * @created : 07/08/2023, Monday
 * @Description:
 **/
public class CompletableFuture2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        out.println("Run a task specified by a Runnable Object asynchronously.");
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            out.println("It is runnig in a separate thread than the main thread.");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Finished";
        });

        out.println("It is also running...");
        out.println(future.get());
        out.println("Done!!!");
    }
}
