package ocjp.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Twist8_1 {
    public static void main(String[] args) {
        Path path = Paths.get("/OCPJavaSE7/../obj8/./8-1.txt");

        System.out.println(path);
        System.out.println(path.getName(1));
        System.out.println(path.getParent());
        System.out.println(path.subpath(2, 4));
    }
}
