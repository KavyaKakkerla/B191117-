import calculator.BasicCalculator;

class MainCalculator {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        double result1 = calculator.add(10, 5);
        double result2 = calculator.subtract(20, 8);
        double result3 = calculator.multiply(4, 6);
        double result4 = calculator.divide(15, 3);

        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + result4);
    }
}
