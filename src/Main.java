public class Main {
    public static void main(String[] args) {
        int menuSelection = UserInterface.displayMenu();

        switch (menuSelection) {
            case 1 -> CalculatorFunction.add();
            case 2 -> CalculatorFunction.subtract();
            case 3 -> CalculatorFunction.multiply();
            case 4 -> CalculatorFunction.divide();
            case 5 -> CalculatorFunction.square();
            case 6 -> CalculatorFunction.squareRoot();
            default -> System.out.println("Invalid Selection!");
        }
    }
}


