package ocjp.paths;

import java.time.LocalDate;
import java.util.Scanner;

public class SolutionTest {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int breadth;
        int height;

        LocalDate date = LocalDate.of(2016, 5, 15);
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                breadth = scanner.nextInt();
                height = scanner.nextInt();

                if (breadth < 0 || height < 0)
                    throw new Exception("Breadth and height must be positive");
                System.out.println(breadth * height);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            scanner.close();
        }
    }
}
