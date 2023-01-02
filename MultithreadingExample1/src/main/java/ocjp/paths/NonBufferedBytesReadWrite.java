package ocjp.paths;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NonBufferedBytesReadWrite {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("/Users/khoivu/OneDrive/Java8/Webhoctap.net_suc-manh-cua-tap-trung.pdf");
             FileOutputStream out = new FileOutputStream("/Users/khoivu/OneDrive/Java8/copy of Webhoctap.net_suc-manh-cua-tap-trung.pdf");) {
            long start = System.currentTimeMillis();
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
            long end = System.currentTimeMillis();
            System.out.println("MilliSeconds elapsed: " + (end - start));
        }
    }
}
