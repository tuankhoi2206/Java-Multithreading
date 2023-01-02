package java8.euthuware;

import java.util.Arrays;
import java.util.List;

interface Carnivore {
    default int calories(List<String> food) {
        return food.size() * 100;
    }

    int eat(List<String> foods);
}

class Tiger implements Carnivore {
    public int eat(List<String> foods) {
        System.out.println("Eating " + foods);
        return foods.size();
    }
}

public class euthuware_4 {

    public static int size(List<String> names) {
        return names.size() * 2;
    }

    public static void process(List<String> names, Carnivore c) {
        c.eat(names);
    }

    public static void main(String[] args) {
        List<String> fnames = Arrays.asList("a", "b", "c");
        Tiger tiger = new Tiger();
//        process(fnames, tiger::eat);

        process(fnames, tiger::calories);
    }
}
