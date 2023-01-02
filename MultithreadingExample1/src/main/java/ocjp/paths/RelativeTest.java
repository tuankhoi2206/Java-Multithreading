package ocjp.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativeTest {
    public static void main(String[] args) {
        Path pathOne = Paths.get("/baeldung/bar/one.txt");
        Path pathTwo = Paths.get("/baeldung/bar/two.txt");
        Path pathThree = Paths.get("/baeldung/foo/three.txt");
        Path result = pathOne.relativize(pathTwo);

        System.out.println(result);

        System.out.println(pathOne.relativize(pathThree));

    }
}
