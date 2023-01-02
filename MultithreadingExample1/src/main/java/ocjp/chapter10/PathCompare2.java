package ocjp.chapter10;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare2 {
    public static final String PATH_POM_FILE = "/Users/khoivu/Java-Multithreading/MultithreadingExample1/pom.xml";

    public static void main(String[] args) {
        Path path = Paths.get(PATH_POM_FILE);
        if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("The file/directory " + path.getFileName() + " exists");
            if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println(path.getFileName() + " is a directory");
            } else {
                System.out.println(path.getFileName() + " is a file");
            }
        } else {
            System.out.println("The file/directory " + path.getFileName()
                    + " does not exits");
        }
    }
}
