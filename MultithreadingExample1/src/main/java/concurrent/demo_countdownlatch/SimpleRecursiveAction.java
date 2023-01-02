package concurrent.demo_countdownlatch;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class SimpleRecursiveAction extends RecursiveAction {
    private int simulateWork;

    public SimpleRecursiveAction(int simulateWork) {
        this.simulateWork = simulateWork;
    }

    @Override
    protected void compute() {
        if (simulateWork > 100) {
            System.out.println("Parallel execution and split the tasks..." + simulateWork);
            SimpleRecursiveAction action1 = new SimpleRecursiveAction(simulateWork / 2);
            SimpleRecursiveAction action2 = new SimpleRecursiveAction(simulateWork / 2);
            invokeAll(action1, action2);
        } else {
            System.out.println("The task is rather small so sequential execution is fine ...");
            System.out.println("The size of the task: " + simulateWork);
        }
    }

    public static void main(String[] args) {
        SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(1000);
        ForkJoinPool pool = new ForkJoinPool();
        simpleRecursiveAction.invoke();
    }
}
