package java8.euthuware.euthu8.func;

import java.util.List;

public interface Carnivore {
    default int calories(List<String> food) {
        System.out.println("calories");
        return food.size() * 100;
    }

    int eat(List<String> foods);
}
