Stack Demo simple program:
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack: " + stack);

        // Pop - LIFO (Last In First Out)
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Top element
        System.out.println("Top: " + stack.peek());

        // Search
        System.out.println("Is empty? " + stack.empty());
    }
}