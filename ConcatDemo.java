Concat Demo in Java:
public class ConcatDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        // 1. Using concat() method
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(" ").concat(s2));

        // 2. Using + operator
        System.out.println(s1 + " " + s2);

        // 3. Using StringBuilder (best for many strings)
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2);
        System.out.println(sb.toString());
    }
}
