package java8.euthuware.euthu8.func;

import java.util.List;

public class Tiger implements Carnivore {
    @Override
    public int eat(List<String> foods) {
        System.out.println("Eating " + foods);
        return foods.size() * 200;
    }
}
