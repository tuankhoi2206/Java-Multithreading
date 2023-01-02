package java8.euthuware.euthu8.locales;

import java.util.Locale;

public class WayCreateLocale {
    public static void main(String[] args) {
        Locale locale1 = new Locale("it", "", "");
        System.out.println(locale1);

        Locale locale2 = Locale.forLanguageTag("it");
        System.out.println(locale2);

        Locale locale3 = new Locale.Builder().setLanguageTag("it").build();
        System.out.println(locale3);

        Locale locale4= Locale.ITALIAN;
        System.out.println(locale4);
    }
}
