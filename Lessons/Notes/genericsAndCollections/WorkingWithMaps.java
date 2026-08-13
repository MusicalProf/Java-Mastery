package Notes.genericsAndCollections;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        // Map doesn't inherit from the collection interface. It stores key-value pairs.
        Map<String, Integer> nameAgesMap = new HashMap<>();
        nameAgesMap.put("Johnathan", 31); // The key-values must match the order of the instantiation.
        nameAgesMap.put("Maria", 32);
        nameAgesMap.put("Lola", 25);

        System.out.println(nameAgesMap);
        System.out.println(nameAgesMap.get("Johnathan"));

        for(Integer i : nameAgesMap.values()){ // We can loop over the values with a forEach loop.
            System.out.println(i);
        }

        for(String s : nameAgesMap.keySet()){
            System.out.println(s + ": " + nameAgesMap.get(s));
        }

        for(Map.Entry<String, Integer> entry : nameAgesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        nameAgesMap.remove("Lola");
        nameAgesMap.put("Johnathan", 32);

        System.out.println(nameAgesMap);
    }
}
