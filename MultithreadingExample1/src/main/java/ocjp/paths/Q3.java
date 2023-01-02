package ocjp.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q3 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/Users/khoivu/./OneDrive/Toeic/../TUYỂN-TẬP-500-CÂU-TOEIC-PART-5-HAY-Lam Tran.pdf");
        Path p2 = Paths.get("/Users/khoivu/Downloads/OCPJP 8.pdf");
        Path p3 = p2.relativize(p1);
        System.out.println(p3);
    }
}
