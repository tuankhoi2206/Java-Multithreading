package concurrent.fork_join;

import java.util.concurrent.RecursiveTask;

public class SearchWork extends RecursiveTask<Integer> {
    @Override
    protected Integer compute() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2,4));
    }
}
