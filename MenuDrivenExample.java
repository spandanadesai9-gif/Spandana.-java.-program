Menu Driven Example simple program:
import java.util.Scanner;

public class MenuDrivenExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter 2 numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (choice == 1)
                    System.out.println("Sum = " + (a + b));
                else
                    System.out.println("Diff = " + (a - b));
            }

        } while (choice != 3);

        System.out.println("Exited");
        sc.close();
    }
}