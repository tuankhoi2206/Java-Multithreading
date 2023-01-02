package java8;

public interface DefaultInterface {
    default void print(String a) {
        System.out.println("This is my test" + a);
    }

    int add(int a, int b);
}
