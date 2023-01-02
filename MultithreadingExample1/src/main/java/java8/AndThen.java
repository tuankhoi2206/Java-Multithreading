package java8;

import java.util.function.Function;

public class AndThen {
    public static void main(String[] args) {
        Function<Integer, Integer> negate = i -> -i,
                square = i -> i * i,
                negateSquere = negate.compose(square);
        System.out.println(negateSquere.apply(10));
    }
}
