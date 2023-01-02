package ocjp.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfor1 {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("/test/testfile.txt");
        //retrieve basic information about path
        System.out.println("Printing file information");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of the target: " + testFilePath.getParent());
    }
}
