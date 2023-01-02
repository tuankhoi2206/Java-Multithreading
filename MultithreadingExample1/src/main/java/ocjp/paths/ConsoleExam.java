package ocjp.paths;

import java.io.Console;

public class ConsoleExam {
    public static void main(String[] args) {
        Console c = System.console();
        String uname = c.readLine("Please enter your name: ");
        char[] p = c.readPassword("Password");
        System.out.println("User name: " + uname.toString());
        System.out.println("Password : ");
        for (char ch : p) {
            System.out.println(ch);
        }
    }
}
