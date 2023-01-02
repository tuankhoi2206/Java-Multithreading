package ocjp.chapter10;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfor2 {
    public static void main(String[] args) throws IOException {
        Path testFilePath = Paths.get("/Users/khoivu/Downloads/enthuware.txt");
        System.out.println("The file name is: " + testFilePath.getFileName());
        System.out.println("Its URI is: " + testFilePath.toUri());
        System.out.println("Its absolute path is: " + testFilePath.toAbsolutePath());
        System.out.println("Its normalized path is : " + testFilePath.normalize());
        System.out.println("Get name(0) is: " + testFilePath.getName(3));
        System.out.println("Get Root is : " +testFilePath.getRoot());

        Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
        System.out.println("Its normalized absolute path is: " + testPathNormalized.toAbsolutePath());
        System.out.println("Its normalized real path is: " + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));
    }
}
