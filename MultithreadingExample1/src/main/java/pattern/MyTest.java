

import java.util.Arrays;
import java.util.List;

public class Main {
    private static String msg = "Hello";
    private static String changeMsg(String m) {
        msg = m;
        return null;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            assert false : changeMsg("Bye");
        }
        System.out.println(msg);
    }
}
