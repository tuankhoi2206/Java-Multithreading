package ocjp.paths;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare1 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/Users/Test1");
        Path path2 = Paths.get("/1Users1/aa");
        System.out.println("(path1.compareTo(path2)==0) is: " + (path1.compareTo(path2) == 0));
        System.out.println("path1.equals(path2) is: " + path1.equals(path2));
        System.out.println(path1.toAbsolutePath());
        System.out.println("path2.equals(path1.toAbsolutePath()) is " + path2.equals(path1.toAbsolutePath()));

        File file = new File("//a//b//c//d//e");
        System.out.println(file.getParentFile());
        System.out.println(path1.resolve(path2));
    }
}
