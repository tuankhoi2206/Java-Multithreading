package ocjp.paths;

import java.util.ArrayList;
import java.util.Scanner;

public class AbsoluteRelavativePathExample {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Input N: ");
        int n = scanner.nextInt();
        if (n < 1 || n > 4000) {
            scanner.close();
            throw new IllegalArgumentException("N is invalid");
        }

        //System.out.println("Input value of lit integer");
        ArrayList<Integer> integers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            integers.add(scanner.nextInt());
        }

        //System.out.println("Input the number of queries: ");
        int numberQ = scanner.nextInt();
        while (numberQ-- > 0) {
            String command = scanner.next();
            if ("Insert".equals(command)) {
                int index = scanner.nextInt();
                int numInsert = scanner.nextInt();
                integers.add(index, numInsert);
            }
            if ("Delete".equals(command)) {
                int deleteIndex = scanner.nextInt();
                integers.remove(deleteIndex);
            }
        }
        integers.forEach(i -> {
            System.out.print(i + " ");
        });
        scanner.close();
    }
}