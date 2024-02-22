package model;

import model.operations.Divide;
import model.operations.Multiply;
import model.operations.Subtract;
import model.operations.Summation;
import model.logfile.LogFile;
import model.logfile.Loggable;
import view.ViewforClients;

public class ComplexCalculator {


    public void runOperation() {
        ViewforClients listMenu = new ViewforClients();
        Summation summation = new Summation();
        Subtract subtract = new Subtract();
        Multiply multiply = new Multiply();
        Divide divide = new Divide();
        Loggable log = new LogFile();
        String txt = "";
//
        while (true) {

            int choice = listMenu.runMenu();

            if (choice == 5) return;
            switch (choice) {
                case 1: {
                    summation.sum();
                    break;
                }
                case 2: {
                    subtract.subtract();
                    break;
                }
                case 3: {
                    multiply.multiply();
                    break;
                }
                case 4: {
                    divide.divide();
                    break;
                }
                default:
                    throw new UnsupportedOperationException("Not supported");
            }
            log.writeFile(txt, "Logger.txt");
        }
    }
}
