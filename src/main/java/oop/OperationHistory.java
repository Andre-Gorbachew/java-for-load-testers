package oop;

public interface OperationHistory {
    public void addToLog(String command);
    public String[] getLog();
}