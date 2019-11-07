package utilities;

import functions.AbstractFunction;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class Writer {

    private final AbstractFunction function;

    public Writer(AbstractFunction function){
        this.function = function;
    }

    public void write(double from, double to, double step) {
        //Files.createDirectories(Paths.get(directory));

        try (FileWriter writer = new FileWriter(getFilename(), true)) {
            for (double x = from; x < to; x += step) {
                double value = function.calc(x);
                writer.append(String.format(Locale.US, "%f,%f%n", x, value));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getFilename() {
        String fnName = this.function.getClass().getSimpleName();
        return fnName + ".csv";
    }
}
