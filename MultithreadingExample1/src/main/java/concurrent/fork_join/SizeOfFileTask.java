package concurrent.fork_join;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SizeOfFileTask extends RecursiveTask<Long> {
    private final File file;

    public SizeOfFileTask(final String fileName) {
        this(new File(fileName));
    }

    public SizeOfFileTask(File file) {
        this.file = Objects.requireNonNull(file);
    }

    @Override
    protected Long compute() {
        if (file.isFile()) {
            return file.length();
        }
        System.out.println("File : " + file.getName());
        final List<SizeOfFileTask> tasks = new ArrayList<>();
        final File[] children = file.listFiles();
        if (children != null) {
            for (final File child : children) {
                final SizeOfFileTask task = new SizeOfFileTask(child);
                task.fork();
                tasks.add(task);
            }
        }
        long size = 0;
        for (final SizeOfFileTask task : tasks) {
            size += task.join();
        }
        return size;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        SizeOfFileTask system = new SizeOfFileTask("/Users/khoivu/My Drive/Git");
        pool.execute(system);
        pool.shutdown();
        System.out.println("Size of Users: " + system.join());
    }
}
