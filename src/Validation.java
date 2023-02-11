import java.util.Scanner;

public class Validation {
    public static int validateInt() {
        Scanner input = new Scanner(System.in);
        int number;
        while (!input.hasNextInt()) {
            System.out.println("Enter an integer!");
            input.next();
        }
        number = input.nextInt();
        return number;
    }

    public static double validateDouble() {
        Scanner input = new Scanner(System.in);
        double number;
        while (!input.hasNextDouble()) {
            System.out.println("Invalid entry, try again!");
            input.next();
        }
        number = input.nextDouble();
        return number;
    }
}