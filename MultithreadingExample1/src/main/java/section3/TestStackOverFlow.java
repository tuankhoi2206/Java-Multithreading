package section3;

import java.util.HashSet;

public class TestStackOverFlow {

    public static int test(int number){
        if(number ==0){
            return 0;
        }
        return test(number++);
    }

    public static void main(String[] args) {
        try {
            test(5);
        } catch (StackOverflowError error){
            System.out.println("This is my test");
        }
    }
}
