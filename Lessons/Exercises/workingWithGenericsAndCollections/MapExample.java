package Exercises.workingWithGenericsAndCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a Map with String keys and Integer values, and add three key-value pairs to it.
        Map<String, Integer> championScores = new HashMap<>();
        championScores.put("Samira", 7584);
        championScores.put("Mel", 6941);
        championScores.put("Smolder", 6505);
        championScores.put("Lucian", 6290);
        championScores.put("Yunara", 6040);

        for (int champScore : championScores.values()){
            System.out.println(champScore);
        }
    }
}
