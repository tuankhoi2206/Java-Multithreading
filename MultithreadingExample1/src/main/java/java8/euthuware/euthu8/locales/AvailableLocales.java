package java8.euthuware.euthu8.locales;

import java.util.Arrays;
import java.util.Locale;

public class AvailableLocales {
    public static void main(String[] args) {
        System.out.println("The default locale is: " + Locale.getDefault());
        Locale[] locales = Locale.getAvailableLocales();
        System.out.printf("No. of other available locales is: %d, and they are: %n", locales.length);
        Arrays.stream(locales).forEach(
                locale -> System.out.printf("Locale code: %s and it stands for %s %n", locale, locale.getDisplayName())
        );

        Locale locale = new Locale("id");
        System.out.println(locale);
    }
}
