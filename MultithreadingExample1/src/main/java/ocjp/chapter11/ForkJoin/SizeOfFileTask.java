package ocjp.chapter11.ForkJoin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RecursiveTask;

public class SizeOfFileTask extends RecursiveTask<Long> {

    private final File file;

    public SizeOfFileTask(String fileName) {
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
}
