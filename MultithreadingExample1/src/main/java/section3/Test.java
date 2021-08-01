package section3;

import java.util.ArrayList;
import java.util.List;

public class Test {
   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(5);
      list.add(10);
      list.add(15);

      list.stream().peek(System.out::println).parallel().forEach(System.out::println);
      String s = null;
      assert s != null;
      System.out.println("This is my test :" + s);
   }
}
