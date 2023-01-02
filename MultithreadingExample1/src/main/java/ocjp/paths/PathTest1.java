package ocjp.paths;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class PathTest1 {
    public static void main(String[] args) throws FileNotFoundException {

        Console c
                = System.console();
        String id= c.readLine("%s","Enter UserId:");
        System.out.println("userid is " + id);

        char[] pwd= c.readPassword("%s","Enter Password : ");
        System.out.println("password is " + pwd);

    }
    public void outputText(PrintWriter pw, String txt){
        pw.write(txt);
    }
}
