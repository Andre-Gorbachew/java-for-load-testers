package oop;

import static com.acme.edu.calculator.*;
import static com.acme.edu.calculator.mul;
import static com.acme.edu.calculator.sum;
import static java.lang.Double.parseDouble;

public class CalculeteApp {
    public static void main(String[] args) {

        Calculete calc1 = new Calculete();
        Calculete calc2 = new Calculete();

        calc1.setId(1);
        calc2.setId(5);

        calc1.sum(1, 1);
        calc1.sum(2, 2);
        calc2.div(3, 3);
        calc2.sub(4, 4);

        for (String logEntry : calc1.getLog()) {
            System.out.println(calc1.getId() + " : " + logEntry);
        }
        for (String logEntry : calc2.getLog()) {
            System.out.println(calc2.getId() + " : " + logEntry);
        }
    }
}
