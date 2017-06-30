package com.acme.edu;

/**
 * Created by AA.Gorbachev on 28.06.2017.
 */
public class CalculatorApp {

    public static void main(String[] args) {
        int a=2,b=4,per=0,vto=0,tre=0,chet=0, mem=0;

        per= calculator2.sum(a,b);
        System.out.println("Сумма чисел а и b:         " + calculator2.sum(a,b));

        mem=calculator2.addToMemory(per, mem);
        System.out.println("Общая сумма операций:      " + mem);

        vto= calculator2.sub(a,b);
        System.out.println("Общая сумма операций");
        System.out.println("Разность чисел а и b:      " + calculator2.sub(a,b));
        mem=calculator2.addToMemory(vto, mem);
        System.out.println("Общая сумма операций:      " + mem);

        tre= calculator2.mul(a,b);
        System.out.println("Произведение чисел а и b:  " + calculator2.mul(a,b));
        mem=calculator2.addToMemory(tre, mem);
        System.out.println("Общая сумма операций:      " + mem);

        chet= calculator2.div(a,b);
        System.out.println("Частное чисел а и b:       " + calculator2.div(a,b));
        mem=calculator2.addToMemory(chet, mem);
        System.out.println("Общая сумма операций:      " + mem);
    }
}
