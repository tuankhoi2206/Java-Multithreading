package ocjp.chapter10;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfor1 {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("/Users/khoivu/Downloads/enthuware.txt");
        System.out.println("Printing file information");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of the target: " + testFilePath.getParent());
        System.out.println("\t name count: " + testFilePath.getNameCount());
        System.out.println("Printing elements of the path: ");
        for (Path element : testFilePath) {
            System.out.println("\t path element: " + element);
        }
    }
}
