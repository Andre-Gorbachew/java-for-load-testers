package com.acme.edu;

import static com.acme.edu.calculator.*;
import static java.lang.Double.parseDouble;

public class CalculatorApp {
    public static void main(String[] args) {
        String command = "";
        String arg1 = "";
        String arg2 = "";
        int position = 0;

        for (String current : args) {
            switch (position++) {
                case 0:
                    command = current;
                    if (command.equals("getLog")){
                        for(String logEntry : getLog()){
                            System.out.println(">>> " + logEntry);
                        }
                        position = 0;
                        break;
                    }
                    break;
                case 1:
                    arg1 = current;
                    break;
                case 2: {
                    arg2 = current;
                    doCalculate(command, parseDouble(arg1), parseDouble(arg2));
                    position = 0;
                    break;
                }
                default: System.out.println("Error");
            }
        }
    }
    public static void doCalculate(String operator, Double arg1, Double arg2) {
        switch (operator) {
            case "module":
                System.out.println(module(arg1));
                break;
            case "div":
                System.out.println(arg1 + " " + operator + " " + arg2 + " = " + div(arg1, arg2));
                break;
            case "sub":
                System.out.println(arg1 + " " + operator + " " + arg2 + " = " + sub(arg1, arg2));
                break;
            case "mul":
                System.out.println(arg1 + " " + operator + " " + arg2 + " = " + mul(arg1, arg2));
                break;
            case "sum":
                System.out.println(arg1 + " " + operator + " " + arg2 + " = " + sum(arg1, arg2));
                break;
        }
    }
}
