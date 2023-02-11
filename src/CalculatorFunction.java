public class CalculatorFunction {
    public static void add() {
        System.out.println("Enter the first digit.");
        double a = UserInterface.validateDouble();
        System.out.println("Enter the second digit.");
        double b = UserInterface.validateDouble();
        double c = a + b;
        UserInterface.displayOutput(a, b, c, '+');
    }

    public static void subtract() {
        System.out.println("Enter the first digit.");
        double a = UserInterface.validateDouble();
        System.out.println("Enter the second digit.");
        double b = UserInterface.validateDouble();
        double c = a - b;
        UserInterface.displayOutput(a, b, c, '-');
    }

    public static void multiply() {
        System.out.println("Enter the first digit.");
        double a = UserInterface.validateDouble();
        System.out.println("Enter the second digit.");
        double b = UserInterface.validateDouble();
        double c = a * b;
        UserInterface.displayOutput(a, b, c, '*');
    }

    public static void divide() {
        System.out.println("Enter the first digit.");
        double a = UserInterface.validateDouble();
        System.out.println("Enter the second digit.");
        double b = UserInterface.validateDouble();
        double c = a / b;
        UserInterface.displayOutput(a, b, c, '/');
    }

    public static void square() {
        System.out.println("Enter the number you want to square.");
        double a = UserInterface.validateDouble();
        double c = a * a;
        UserInterface.displayOutput(a, c, "square");
    }

    public static void squareRoot() {
        System.out.println("Enter the number you want the square root of.");
        double a = UserInterface.validateDouble();
        double c = Math.sqrt(a);
        UserInterface.displayOutput(a, c, "square root");
    }
}