package ocjp.paths;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPrimAndObjects {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream in = new FileInputStream("object.data");
             ObjectInputStream ois = new ObjectInputStream(in)) {
            System.out.println(ois.readBoolean());
            CarSerializable c = (CarSerializable) ois.readObject();
            System.out.println(c.model);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
