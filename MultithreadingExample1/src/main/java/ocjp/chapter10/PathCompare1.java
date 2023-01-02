package ocjp.chapter10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare1 {

    public static final String PATH_ENTHUWARE_FILE = "/Users/khoivu/Downloads/enthuware.txt";
    public static final String PATH_POM_FILE = "/Users/khoivu/Java-Multithreading/MultithreadingExample1/pom.xml";

    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("pom.xml");
        Path path2 = Paths.get(PATH_POM_FILE);
        System.out.println("(path1.equals(path2) == 0) is: "
                + (path1.compareTo(path2) == 0));

        //comparing two paths using equals() method
        System.out.println("path1.equals(path2) is: " + path1.equals(path2));

        //comparing two paths using equals() method with absolute path
        System.out.println("path2.equals(path1.toAbsolutePath() is " + path2.equals(path1.toAbsolutePath()));

        System.out.println("Files.isSamefile(path1, path2) is: " + Files.isSameFile(path1, path2));
    }
}
