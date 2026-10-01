HashMap Demo simple program:
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println(map);

        // Get value by key
        System.out.println("Key 2: " + map.get(2));

        // Remove by key
        map.remove(1);
        System.out.println("After remove: " + map);

        // Loop through HashMap
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}