Return Type Example in Java:
public class ReturnTypeEx {

    // return type int
    static int add(int a, int b) {
        return a + b;
    }

    // return type String
    static String greet(String name) {
        return "Hello " + name;
    }

    // return type boolean
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // return type void - returns nothing
    static void display() {
        System.out.println("This is void method");
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(greet("Ram"));
        System.out.println(isEven(4));
        display();
    }
}
