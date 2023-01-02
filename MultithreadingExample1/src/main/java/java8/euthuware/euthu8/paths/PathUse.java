package java8.euthuware.euthu8.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathUse {
    public static void main(String[] args) {
        Path p1 = Paths.get("/baeldung/articles/test.txt");
        Path p2 = Paths.get("/baeldung/articles/java.pdf");

        //System.out.println(p2.toString());
        System.out.println(p1.resolve(p2));

        p1 = Paths.get("articles");
        p2 = Paths.get("authors");

        Path p1_rel_p2 = p1.relativize(p2);
        Path p2_rel_p1 = p2.relativize(p1);

        //System.out.println(p1_rel_p2);
        //System.out.println(p2_rel_p1);

    }
}
