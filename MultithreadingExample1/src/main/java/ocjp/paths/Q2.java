package ocjp.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q2 {
    public static void main(String[] args) {
        Path path = Paths.get("/mydir/code");
        System.out.println(path.resolve(Paths.get("Users/khoivu/OneDrive/Java8/etsviewer.jar")));
        System.out.println(path.resolve("world/Hello.java"));

        Path absolutePath = Paths.get("/Users/khoivu/OneDrive/Java8/");
        System.out.println(absolutePath.resolve(path));
        System.out.println(path.resolve(absolutePath));
    }
}
