import java.util.Scanner;

public class UserInterface {
    public static int displayMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Choose an option by entering a number between 1 and 7:");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.println("5. Square a number");
        System.out.println("6. Find the square root of a number");
        System.out.println("7. Quit");
        return (input.nextInt());
    }

    public static void displayOutput(double a, double b, double c, char sign) {
        String output = "";
        if (a == (long) a) {
            output += String.format("%d", (long) a);
        } else {
            output += String.format("%s", a);
        }
        output += " " + sign + " ";
        if (b == (long) b) {
            output += String.format("%d", (long) b);
        } else {
            output += String.format("%s", b);
        }
        output += " = ";
        if (c == (long) c) {
            output += String.format("%d", (long) c);
        } else {
            output += String.format("%s", c);
        }
        System.out.println(output);
    }

    public static void displayOutput(double a, double c, String calculationType) {
        String output = "";
        if (calculationType.equals("square")) {
            if (a == (long) a) {
                output += String.format("%d", (long) a);
            } else {
                output += String.format("%s", a);
            }
            output += " squared is ";
            if (c == (long) c) {
                output += String.format("%d", (long) c);
            } else {
                output += String.format("%s", c);
            }
        } else if (calculationType.equals("square root")) {
            output += "The square root of ";
            if (a == (long) a) {
                output += String.format("%d", (long) a);
            } else {
                output += String.format("%s", a);
            }
            output += " is ";
            if (c == (long) c) {
                output += String.format("%d", (long) c);
            } else {
                output += String.format("%s", c);
            }
        }
        System.out.println(output);
    }
}
