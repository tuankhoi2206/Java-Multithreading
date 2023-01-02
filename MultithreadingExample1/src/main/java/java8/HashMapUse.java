package java8;

import java.util.HashMap;

public class HashMapUse {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hga");
        hashMap.put(2, null);
        hashMap.put(3, "sho");
        hashMap.computeIfAbsent(2, v -> "update");
        System.out.println(hashMap);

        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("Geeks", 1);
        wordCount.put("for", 2);
        wordCount.put("geeks", 3);

        System.out.println("Hashmap before operation :\n" + wordCount);
        wordCount.computeIfPresent("Geek",
                (key, val) -> val + 100
        );

        System.out.println("HashMap after operation :\n" + wordCount);
    }
}
