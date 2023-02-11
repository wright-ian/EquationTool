import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuSelection = input.nextInt();
        System.out.println("Select one of the following equations. To select the equation, enter the corresponding number.");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.println("5. Square a number");
        System.out.println("6. Find the square root of a number");

        switch (menuSelection) {
            case 1:
        }
    }
    public static double add(double a, double b) {
        return a + b;
    }
}


