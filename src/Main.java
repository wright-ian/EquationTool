import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menuSelection = displayMenu();

        switch (menuSelection) {
            case 1:
                add();
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            default:
        }
    }

    public static int displayMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select one of the following equations. To select the equation, enter the corresponding number.");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.println("5. Square a number");
        System.out.println("6. Find the square root of a number");
        return (input.nextInt());
    }

    public static void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first digit.");
        double a = input.nextDouble();
        System.out.println("Enter the second digit.");
        double b = input.nextDouble();
        double c = a + b;
        displayOutput(a, b, c, '+');
    }

    public static String displayOutput(double a, double b, double c, char sign) {
//        if (d == (long) d)
//            return String.format("%d", (long) d);
//        else
//            return String.format("%s", d);
    }
}


