package ocjp.paths;

import java.io.*;

class Boo implements Serializable {
    transient int ti = 10;
    static int si = 20;
}

public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Boo boo = new Boo();
        boo.si++;
        System.out.println(boo.ti + " " + boo.si);
        FileOutputStream fos = new FileOutputStream("test.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(boo);
        os.close();

        FileInputStream fis = new FileInputStream("test.ser");
        ObjectInputStream is = new ObjectInputStream(fis);

        boo = (Boo) is.readObject();
        is.close();
        System.out.println(boo.ti + " " + boo.si);
    }
}
