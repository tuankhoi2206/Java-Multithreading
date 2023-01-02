package java8.euthuware;

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;

public class euthuware_2 {
    public static void main(String[] args) {
        String limerick = "There was a young lady named Bright";
        limerick += " who traveled much faster than light";
        limerick += " She set out one day";
        limerick += " in a relative way";
        limerick += " and came back the previous day";

        IntSummaryStatistics wordStatistics = Pattern.compile(" ")
                .splitAsStream(limerick)
                .mapToInt(word -> word.length())
                .summaryStatistics();
        System.out.printf("Number of word =%d\nSum of the lengh of the word =%d \n"
                        + "Manimum word size =%d \nMaximum word size %d \n"
                        + "Average word size =%f \n",
                wordStatistics.getCount(),
                wordStatistics.getSum(),
                wordStatistics.getMax(),
                wordStatistics.getMin(),
                wordStatistics.getAverage());
    }
}
