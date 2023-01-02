package concurrent.executorservice.demo1;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Task implements Callable<Result> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Result call() throws Exception {
        System.out.printf("%s: Starting\n", this.name);
        long duration = (long) Math.random() * 10;
        System.out.printf("%s: Waiting %d seconds for result.\n", this.name, duration);
        TimeUnit.SECONDS.sleep(duration);
        return new Result(this.name, LocalDateTime.now().toString());
    }
}
