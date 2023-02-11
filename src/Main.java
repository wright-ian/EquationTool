public class Main {
    public static void main(String[] args) {
        boolean programIsRunning = true;
        while (programIsRunning) {
            int menuSelection = UserInterface.displayMenu();
            switch (menuSelection) {
                case 1 -> CalculatorFunction.add();
                case 2 -> CalculatorFunction.subtract();
                case 3 -> CalculatorFunction.multiply();
                case 4 -> CalculatorFunction.divide();
                case 5 -> CalculatorFunction.square();
                case 6 -> CalculatorFunction.squareRoot();
                case 7 -> programIsRunning = false;
                default -> System.out.println("Invalid Selection!");
            }
        }
        System.out.println("Goodbye!");
    }
}