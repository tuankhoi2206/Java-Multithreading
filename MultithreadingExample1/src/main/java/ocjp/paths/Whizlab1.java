package ocjp.paths;

import java.io.IOException;
import java.io.InputStream;

public class Whizlab1 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[10];
        InputStream in = System.in;
        int i = in.read(b);
        System.out.println(i);
        for (byte c : b) {
            System.out.println("t " + (char) c);
        }
        in.close();
    }
}
