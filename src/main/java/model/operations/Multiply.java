package model.operations;

import model.ComplexNumber;
import model.logfile.LogFile;
import model.logfile.Loggable;

import java.util.Scanner;

public class Multiply {
    Scanner input = new Scanner(System.in);
    ComplexNumber complex1;
    ComplexNumber complex2;
    ComplexNumber complex3;
    Loggable log = new LogFile();

    float a;
    float b;
    public void multiply(){
        String txt;
        int operation = 3;
        System.out.println("\nWhere i = (-1)^1/2,\n");
        System.out.println("(a + bi) * (c + di)\n");
        System.out.println("Input a:");
        a = input.nextFloat();
        System.out.println("Input b:");
        b = input.nextFloat();
        complex1 = new ComplexNumber(a, b);
        System.out.println("Input c:");
        a = input.nextFloat();
        System.out.println("Input d:");
        b = input.nextFloat();
        complex2 = new ComplexNumber(a, b);
        complex3 = complex1.multiply(complex2);
        txt = log.getExpression(complex1, complex2, complex3, operation);
        System.out.println("The result is: " + complex3.toString());
        log.writeFile(txt, "Logger.txt");
    }
}

