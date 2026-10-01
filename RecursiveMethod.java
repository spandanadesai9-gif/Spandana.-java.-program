Recursive Method - Simple Java:
public class RecursiveMethod {

    // Recursive method to find factorial
    static int factorial(int n) {
        if (n == 1) {
            return 1; // base condition
        }
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}