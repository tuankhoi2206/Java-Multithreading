package ocjp.paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Path1 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("8-1.txt");
        Path path = file.toAbsolutePath();
        System.out.println(path);

        Path path1 = Paths.get("..//8-1.txt");
        System.out.println(path1.toAbsolutePath());
        System.out.println(path1.toAbsolutePath().normalize());

        Path dirName = Paths.get("D://OCPJP//programs//NIO2//");
        Path resolvedPath = Paths.get("//OCPJP");

        System.out.println(resolvedPath.resolve(dirName));

        Path sourceFile = Paths.get("/Users/khoivu/Library/CloudStorage/OneDrive-Personal/java_program_2.pdf");
        Path destinationFile = Paths.get("/Users/khoivu/Library/CloudStorage/OneDrive-Personal/Java8/1-java_program_2.pdf");
        Files.move(sourceFile, destinationFile, StandardCopyOption.ATOMIC_MOVE);

    }
}
