ArrayList Demo simple program:
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list);

        // Get element
        System.out.println(list.get(1));

        // Remove element
        list.remove("Banana");
        System.out.println(list);

        // Loop through list
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
