package hackerrand;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //1. sum the lengths of A and B
        int sumAandB = 0;
        boolean isValidA = A != null && A.length() > 0;
        boolean isValidB = B != null && B.length() > 0;
        if (isValidA)
            sumAandB += A.length();
        if (isValidB)
            sumAandB += B.length();
        System.out.println(sumAandB);

        //2. A is lexicographically greater than B
        if (isValidA && isValidB) {
            if (A.compareTo(B) > 0)
                System.out.println("Yes");
            else
            System.out.println("No");
        }


        if (isValidA) {
            A = A.substring(0, 1).toUpperCase() + A.substring(1);
        }

        if (isValidB) {
            B = B.substring(0, 1).toUpperCase() + B.substring(1);
        }
        System.out.println(A + " " + B);
    }
}
