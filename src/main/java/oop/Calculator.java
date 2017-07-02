package oop;

public class Calculator {
    private OperationHistory log;

    public String[] getLog() {
        return log.getLog();
    }

    public Calculator(OperationHistory log){
        this.log = log;
    }

    public int sum(int a, int b) {
        if(b == 0){
            return 0;
        }
        log.addToLog(a + " sum " + b + " = " + (a + b));
        return restriction(a + b);
    }

    public double sum(double a, double b) {
        if(b == 0){
            return 0.;
        }
        log.addToLog(a + " sum " + b + " = " + (a + b));
        return restriction(a + b);
    }

    public int sub(int a, int b) {
        if(b == 0){
            return 0;
        }
        log.addToLog(a + " sub " + b + " = " + (a - b));
        return restriction(a - b);
    }

    public double sub(double a, double b) {
        if(b == 0){
            return 0.;
        }
        log.addToLog(a + " sub " + b + " = " + (a - b));
        return restriction(a - b);
    }

    public int mul(int a, int b) {
        if(b == 0){
            return 0;
        }
        log.addToLog(a + " mul " + b + " = " + (a * b));
        return restriction(a * b);
    }

    public double mul(double a, double b) {
        if(b == 0){
            return 0.;
        }
        log.addToLog(a + " mul " + b + " = " + (a * b));
        return restriction(a * b);
    }

    public int div(int a, int b) {
        if(b == 0){
            return 0;
        }
        log.addToLog(a + " div " + b + " = " + (a / b));
        return restriction(a / b);
    }

    public double div(double a, double b) {
        if(b == 0){
            return 0.;
        }
        log.addToLog(a + " div " + b + " = " + (a / b));
        return restriction(a / b);
    }

    public static int module(int w){
        if(w < 0){
            w = -w;
        }
        return restriction(w);
    }

    public static double module(double w){
        if(w < 0){
            w = -w;
        }
        return restriction(w);
    }

    public static double restriction(double w){
        if(w >= -10 & w <= 10) {
            return w;
        }else if (w > 10){
            return 10;
        }else{
            return -10;
        }
    }

    public static int restriction(int w){
        if(w >= -10 & w <= 10) {
            return w;
        }else if (w > 10){
            return 10;
        }else{
            return -10;
        }
    }
}
