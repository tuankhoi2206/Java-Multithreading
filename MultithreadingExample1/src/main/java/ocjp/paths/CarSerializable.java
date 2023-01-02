package ocjp.paths;

import java.io.*;

class Engine {
    String make = "198768";
}

public class CarSerializable implements Serializable {
    String model = "Luxury";
    Engine engine = new Engine();

    public static void main(String[] args) throws FileNotFoundException {
        try (FileOutputStream out = new FileOutputStream("object.data");
             ObjectOutputStream oos = new ObjectOutputStream(out);) {
            CarSerializable c = new CarSerializable();
            oos.writeObject(c);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
