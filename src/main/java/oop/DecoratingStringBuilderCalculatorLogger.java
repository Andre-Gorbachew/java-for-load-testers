package oop;

public class DecoratingStringBuilderCalculatorLogger extends StringBuilderCalculatorLogger {

    public DecoratingStringBuilderCalculatorLogger() {
        super();
    }

    public DecoratingStringBuilderCalculatorLogger(StringBuilder log) {
        super(log);
    }

    @Override
    public void addToLog(String command) {
        super.addToLog("[PROD] " + command);
    }
}
