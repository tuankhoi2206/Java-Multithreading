package collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NaviableMapExamp {
    public static void main(String[] args) {
        NavigableMap<String, String> myMap = new TreeMap<>();
        myMap.put("a", "apple");
        myMap.put("b", "boy");
        myMap.put("c", "cat");
        myMap.put("aa", "apple1");
        myMap.put("bb", "boy2");
        myMap.put("cc", "cat2");
        myMap.pollLastEntry();
        myMap.pollFirstEntry();

        System.out.println("myMap : " + myMap);
        NavigableMap<String, String> tailMap = myMap.tailMap("bb", false);
        System.out.println(tailMap);
        System.out.println(tailMap.pollFirstEntry());
        System.out.println(myMap.size());

    }
}
