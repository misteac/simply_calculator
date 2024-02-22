package model.logfile;

import model.ComplexNumber;

public interface Loggable {
     void writeFile(String expression, String nameFile);
     String getExpression(ComplexNumber complex1, ComplexNumber complex2,
                                ComplexNumber complex3, Integer operation);
}
