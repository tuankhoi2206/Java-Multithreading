package ocjp.paths;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class PathTest {
    public static void main(String[] args) throws FileNotFoundException {

        Console c
                = System.console();
        String id= c.readLine("%s","Enter UserId:");
        System.out.println("userid is " + id);

//        Path p1= Paths.get("/p/readme.txt");
//        Path p2= Paths.get("/read.txt");
//        Path p3 = p1.relativize(p2);
//        System.out.println(p3);
//
//        Stream<String> ref = new BufferedReader(new FileReader("/Users/khoivu/Library/CloudStorage/OneDrive-Personal/Java8/enthuware.txt")).lines();
//        ref.forEach(System.out::println);
    }
}
