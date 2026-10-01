Try-Catch Demo simple Java:
public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // error here
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        System.out.println("Program continues...");
    }
}
