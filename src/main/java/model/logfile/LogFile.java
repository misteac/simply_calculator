package model.logfile;

import model.ComplexNumber;

import java.io.FileWriter;
import java.io.IOException;

public class LogFile implements Loggable {
    @Override
    public void writeFile(String expression, String nameFile) {
        try (FileWriter fw = new FileWriter(nameFile, true)) {
            fw.write(expression + " ");
            fw.append('\n');
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String getExpression(ComplexNumber complex1, ComplexNumber complex2,
                                ComplexNumber complex3, Integer operation) {
        String result = "";
        if (operation == 1)
            result = String.format("%s + %s = %s", complex1, complex2, complex3);

        else if (operation == 2)
            result = String.format("%s - %s = %s", complex1, complex2, complex3);

        else if (operation == 3)
            result = String.format("%s * %s = %s", complex1, complex2, complex3);

        else if (operation == 4)
            result = String.format("%s / %s = %s", complex1, complex2, complex3);
            return result;

    }

}
