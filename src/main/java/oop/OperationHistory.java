package oop;

public class OperationHistory {
    private StringBuilder log = new StringBuilder();

    public String[] getLog(){
        return log.toString().split("\n");
    }
    public void addToLog(String command) {
        log.append(command);
        log.append("\n");
    }
}
