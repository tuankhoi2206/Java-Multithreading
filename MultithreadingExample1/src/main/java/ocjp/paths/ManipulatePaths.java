package ocjp.paths;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ManipulatePaths {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("/Users/khoivu/OneDrive/Java8/etsviewer.jar");
        System.out.println("toString()-> " + path.toString());
        System.out.println("getRoot()-> " + path.getRoot());
        System.out.println("getName(0)-> " + path.getName(0));
        System.out.println("getName(1)-> " + path.getName(1));
        System.out.println("getFileName() -> " + path.getFileName());
        System.out.println("getNameCount() -> " + path.getNameCount());
        System.out.println("getParent () -> " + path.getParent());
        System.out.println("subpath(0,2) -> " + path.subpath(0, 2));

    }
}
