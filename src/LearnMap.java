import java.util.Map;
import java.util.HashMap;

public class LearnMap {
    public static void main(String[] args) {
//        Init a new map
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "John");
        myMap.put(2, "Peter");
        myMap.put(3, "Alex");
        System.out.println("myMap: " + myMap);
//        putAll method
        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(4, "David");
        newMap.put(5, "Bon");
        myMap.putAll(newMap);
        System.out.println("myMap after putAll: " + myMap);
//        Get value
        System.out.println("myMap: " + myMap);
        System.out.println("Value of entry has key = 1: " + myMap.get(1));
        System.out.println("Value of entry has key = 2: " + myMap.get(2));
//        Update value using put()
        System.out.println("myMap: " + myMap);
        myMap.put(5, "Bean");
        System.out.println("Updated: " + myMap);
//        remove method
        System.out.println("myMap: " + myMap);
        myMap.remove(5);
        System.out.println("Remove element has key = 5: " + myMap);
//        size, clear and isEmpty method
        System.out.println("myMap: " + myMap);
        System.out.println("Size of hashmap: " + myMap.size());
        myMap.clear();
        System.out.println("Hashmap after clearing: " + myMap);
        System.out.println("isEmpty: " + myMap.isEmpty());
    }
}
