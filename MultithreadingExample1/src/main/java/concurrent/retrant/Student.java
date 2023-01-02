package concurrent.retrant;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Student {
    private Map<String, Integer> marksObtained = new HashMap<>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void setMarksObtained(String subject, Integer marks) {
        lock.writeLock().lock();
        marksObtained.put(subject, marks);
        lock.writeLock().unlock();
    }

    public double getAverageMarks() {
        lock.readLock().lock();
        double sum = 0.0;
        try {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (Integer mark : marksObtained.values()) {
                sum += mark;
            }
            return sum / marksObtained.size();
        } finally {
            lock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        final Student s = new Student();
        new Thread(() -> {
            int x = 0;
            while (true) {
                int m = (int) (Math.random() * 100);
                System.err.println("Write data");
                s.setMarksObtained("Sub " + x, m);
                x++;

            }
        }).start();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                while (true) {
                    double av = s.getAverageMarks();
                    System.out.println(av);
                }
            }).start();
        }
    }
}
