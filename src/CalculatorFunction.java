import java.util.Scanner;

public class CalculatorFunction {
    public static void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first digit.");
        double a = input.nextDouble();
        System.out.println("Enter the second digit.");
        double b = input.nextDouble();
        double c = a + b;
        UserInterface.displayOutput(a, b, c, '+');
    }

    public static void subtract() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first digit.");
        double a = input.nextDouble();
        System.out.println("Enter the second digit.");
        double b = input.nextDouble();
        double c = a - b;
        UserInterface.displayOutput(a, b, c, '-');
    }

    public static void multiply() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first digit.");
        double a = input.nextDouble();
        System.out.println("Enter the second digit.");
        double b = input.nextDouble();
        double c = a * b;
        UserInterface.displayOutput(a, b, c, '*');
    }

    public static void divide() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first digit.");
        double a = input.nextDouble();
        System.out.println("Enter the second digit.");
        double b = input.nextDouble();
        double c = a / b;
        UserInterface.displayOutput(a, b, c, '/');
    }

    public static void square() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first digit.");
        double a = input.nextDouble();
        double c = a * a;
        UserInterface.displayOutput(a, c);
    }

    public static void squareRoot() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first digit.");
        double a = input.nextDouble();
        System.out.println("Enter the second digit.");
        double b = input.nextDouble();
        double c = a - b;
        UserInterface.displayOutput(a, b, c, '-');
    }
}