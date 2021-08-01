package section3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Exception1 extends IOException {
}

class Exception2 extends Exception {
}

public class Test1 {
   public static void main(String[] args) {
      try {
         int a = 10;
         if (a <= 10) throw new Exception1();
         else
            throw new Exception2();
      } catch (Exception1 | Exception2 e) {
         e.printStackTrace();
      }
   }
}
