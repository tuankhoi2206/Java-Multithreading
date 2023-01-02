package ocjp.paths;

import java.io.*;

public class Q1 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("contacts.txt"));
        dos.writeDouble(999.999);

        DataInputStream dis = new DataInputStream(new FileInputStream("contacts.txt"));
        System.out.println(dis.read());
    }
}
