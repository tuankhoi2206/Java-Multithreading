package assert_example;

public class AssertionExample1 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;
        if (i < 10) {
            i = -i;
        }
        System.out.println("the value of i is:" + i);
        //at this point the assumption is that i cannot be negative
        //assert this condition since its an assumption that will always hold
        assert (i >= 0) : "impossible: i is nagative!";
    }
}
