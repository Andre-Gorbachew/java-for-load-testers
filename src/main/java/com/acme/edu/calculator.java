package com.acme.edu;
public class calculator {
    public static StringBuilder log = new StringBuilder();

    public static int sum(int a, int b) {
        if(b == 0){
            return 0;
        }
        log.append(a).append(" sum ").append(b).append(" = ").append(a + b).append("\n");
        return restriction(a + b);
    }
    public static double sum(double a, double b) {
        if(b == 0){
            return 0.;
        }
        log.append(a).append(" sum ").append(b).append(" = ").append(a + b).append("\n");
        return restriction(a + b);
    }

    public static int sub(int a, int b) {
        if(b == 0){
            return 0;
        }
        log.append(a).append(" sub ").append(b).append(" = ").append(a - b).append("\n");
        return restriction(a - b);
    }
    public static double sub(double a, double b) {
        if(b == 0){
            return 0.;
        }
        log.append(a).append(" sub ").append(b).append(" = ").append(a - b).append("\n");
        return restriction(a - b);
    }

    public static int mul(int a, int b) {
        if(b == 0){
            return 0;
        }
        log.append(a).append(" mul ").append(b).append(" = ").append(a * b).append("\n");
        return restriction(a * b);
    }
    public static double mul(double a, double b) {
        if(b == 0){
            return 0.;
        }
        log.append(a).append(" mul ").append(b).append(" = ").append(a * b).append("\n");
        return restriction(a * b);
    }

    public static int div(int a, int b) {
        if(b == 0){
            return 0;
        }
        log.append(a).append(" div ").append(b).append(" = ").append(a / b).append("\n");
        return restriction(a / b);
    }
    public static double div(double a, double b) {
        if(b == 0){
            return 0.;
        }
        log.append(a).append(" div ").append(b).append(" = ").append(a / b).append("\n");
        return restriction(a / b);
    }
    public static String[] getLog(){
        return log.toString().split("\n");
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