package ocjp.paths;

import java.io.*;

public class BufferedBytesReadWrite {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("/Users/khoivu/OneDrive/Java8/Webhoctap.net_suc-manh-cua-tap-trung.pdf");
             FileOutputStream out = new FileOutputStream("/Users/khoivu/OneDrive/Java8/copy of Webhoctap.net_suc-manh-cua-tap-trung.pdf");) {
            BufferedInputStream bis = new BufferedInputStream(in);
            BufferedOutputStream bos = new BufferedOutputStream(out);
            long start = System.currentTimeMillis();
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            long end = System.currentTimeMillis();
            System.out.println("MilliSeconds elapsed: " + (end - start));
        }
    }
}
