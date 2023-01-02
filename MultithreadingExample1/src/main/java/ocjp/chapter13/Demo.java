package ocjp.chapter13;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {

    class Inner {
        static final int k = 10;
        
    }

    public static void main(String[] args) {
//        Locale localeEn = new Locale("vn");
        Locale.setDefault(new Locale("en"));
        Locale localeEn = Locale.getDefault();
        ResourceBundle labels = ResourceBundle.getBundle("messages", localeEn);
//        System.out.println(labels.getString("hello"));

        Enumeration<String> en = labels.getKeys();
        while (en.hasMoreElements()) {
            String key = en.nextElement();
            String val = labels.getString(key);
            System.out.println(key + " : " + val);
        }
    }
}
