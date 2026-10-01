Queue Demo simple program:
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        // Removing - FIFO (First In First Out)
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // Head of queue
        System.out.println("Head: " + queue.peek());

        // Size
        System.out.println("Size: " + queue.size());
    }
}
