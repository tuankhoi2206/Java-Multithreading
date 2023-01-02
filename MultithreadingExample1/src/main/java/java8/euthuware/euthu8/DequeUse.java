package java8.euthuware.euthu8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeUse {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.offerLast(2);
        d.push(3);
        d.peekFirst();
        d.removeLast();
        d.pop();
        System.out.println(d);
    }
}
