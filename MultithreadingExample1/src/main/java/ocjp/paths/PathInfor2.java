package ocjp.paths;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfor2 {
    public static void main(String[] args) throws IOException {
        //get a path object with relative path
        Path testFilePath = Paths.get(".//Test");
        System.out.println("The file name is: " + testFilePath.getFileName());
        System.out.println("Its URI is: " + testFilePath.toUri());
        System.out.println("Is absolute path is: " + testFilePath.toAbsolutePath());
        System.out.println("Is normalized path is: " + testFilePath.normalize());

        //get another path object with normalized relative path
        Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
        System.out.println("Its normalized absolute path is: " + testPathNormalized.toAbsolutePath());
        System.out.println("Its normalized real path is: " + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));

    }
}
