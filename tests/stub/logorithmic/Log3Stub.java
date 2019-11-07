package stub.logorithmic;

import functions.logorithmic.Log3;

import java.util.HashMap;
import java.util.Map;

public class Log3Stub extends Log3 {

    private final Map<Double, Double> table = new HashMap<>();

    public Log3Stub(){
        table.put(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        table.put(3.0 - 0.01, 0.996960);
        table.put(3.0, 1.0);
        table.put(3.0 + 0.01, 1.003029);

        table.put(0.0 - 0.01, Double.NaN);
        table.put(0.0, Double.NaN);
        table.put(0.0 + 0.01, -4.1918065);

        table.put(1.0 - 0.01, -0.009148);
        table.put(1.0, 0.0);
        table.put(1.0 + 0.01, 0.009057);

        table.put(3.0, 1.0);
        table.put(1.5, 0.369070246428);
        table.put(0.5, -0.63092975357);
    }

    public Map<Double, Double> getTable() {
        return table;
    }

    @Override
    public double calcValue(double x) {
        return table.get(x);
    }

}
