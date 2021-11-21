package calculator;

public class Main {
    static Calculator calculator = new CalculatorImpl();
    public static void main(String[] args) {
        int num1 = calculator.add(1, 2);

        System.out.println("num1 = " + num1);
    }
}
