String Comparison in Java:
public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        // 1. Using == (checks reference)
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        // 2. Using equals() (checks content)
        System.out.println(s1.equals(s3)); // true

        // 3. Using equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase("java")); // true

        // 4. Using compareTo()
        System.out.println(s1.compareTo(s2)); // 0 if equal
        System.out.println(s1.compareTo("Python")); // difference
    }
}
