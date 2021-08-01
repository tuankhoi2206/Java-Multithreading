package exceptionss.example_1;

import java.io.IOException;

public class Device implements AutoCloseable {

   String header = null;

   public void open() throws IOException {
      header = "OPENED";
      System.out.println("Device Opened");
      throw new IOException("Unknown");
   }

   public String read() throws IOException {
      return "";
   }

   @Override
   public void close() {
      System.out.println("Closing device");
      header = null;
      throw new RuntimeException("test");
   }

   public static void main(String[] args) throws Exception {
      try (Device device = new Device()) {
         throw new Exception("test");
      }
   }
}
