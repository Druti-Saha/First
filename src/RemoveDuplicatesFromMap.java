import java.util.*;
 
public class RemoveDuplicatesFromMap {
    public static void main(String[] args) {
        // Sample map with duplicate entries
        Map<Integer, String> mapWithDuplicates = new HashMap<>();
        mapWithDuplicates.put(1, "One");
        mapWithDuplicates.put(2, "Two");
        mapWithDuplicates.put(3, "Three");
        mapWithDuplicates.put(4, "Two"); // Duplicate value
        mapWithDuplicates.put(5, "Four");
        mapWithDuplicates.put(6, "Three"); // Duplicate value
 
        // Remove duplicates
        Map<Integer, String> mapWithoutDuplicates = removeDuplicates(mapWithDuplicates);
 
        // Print the map without duplicates
        System.out.println("Map without duplicates: " + mapWithoutDuplicates);
    }
 
    private static <K, V> Map<K, V> removeDuplicates(Map<K, V> map) {
        Map<K, V> mapWithoutDuplicates = new HashMap<>();
        Set<V> uniqueValues = new HashSet<>();
 
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (uniqueValues.add(entry.getValue())) {
                mapWithoutDuplicates.put(entry.getKey(), entry.getValue());
            }
        }
 
        return mapWithoutDuplicates;
    }
}
