package oop;
public class StringBuilderCalculatorLogger implements OperationHistory {

    private StringBuilder log;

    public StringBuilderCalculatorLogger() {
        this.log = new StringBuilder();
    }

    public StringBuilderCalculatorLogger(StringBuilder log) {
        this.log = log;
    }

    @Override
    public String[] getLog() {
        return log.toString().split("\n");
    }

    @Override
    public void addToLog(String command) {
        log.append(command);
        log.append("\n");
    }
}
