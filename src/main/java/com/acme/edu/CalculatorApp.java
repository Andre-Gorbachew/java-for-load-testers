package com.acme.edu;

public class CalculatorApp {

    public static void main(String[] args) {
        /*String par1 = args[0];

        String par2 = args[1];
        Double per1 = Double.parseDouble(par2);

        String par3 = args[2];
        Double per2 = Double.parseDouble(par3);
        switch (par1) {
            case "module" : System.out.println(calculator2.module(per1)); break;
            case "div" : System.out.println(calculator2.div(per1, per2)); break;
            case "sub" : System.out.println(calculator2.sub(per1, per2)); break;
            case "mul" : System.out.println(calculator2.mul(per1, per2)); break;
            case "sum" : System.out.println(calculator2.sum(per1, per2)); break;
        }*/
        String comand = "";
        String ag1 = "";
        String ag2 = "";
        int postion = 0;
        for (String i : args){
            if(postion++ == 0){
                comand = i;
            } else if (postion == 1){
                ag1 = i;
            }else {
                ag2 = i;
                postion = 0;
            }

        }
    }
}
