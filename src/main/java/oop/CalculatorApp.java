package oop;

public class CalculatorApp {
    public static void main(String[] args) {

        Calculator calc1 = new Calculator(
                new DecoratingStringBuilderCalculatorLogger(
                        new StringBuilder("TEST ENV\n")
                )
        );

        calc1.sum(1, 1);
        calc1.sum(2, 2);
        for (String logEntry : calc1.getLog()) {
            System.out.println(logEntry);
        }
    }
}
