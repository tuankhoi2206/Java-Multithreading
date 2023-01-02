package java8.euthuware.euthu8.func;

import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static int size(List<String> names) {
        System.out.println("TestClass size");
        return names.size() * 2;
    }

    public static void process(List<String> names, Carnivore c) {
        c.eat(names);
    }

    public static void main(String[] args) {
        List<String> fnames = Arrays.asList("a", "b", "c");
        Tiger t= new Tiger();
        process(fnames, TestClass::size);
    }
}
