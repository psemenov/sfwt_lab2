package stub.logorithmic;

import java.util.HashMap;
import java.util.Map;

public class Log3Stub {

    private final Map<Double, Double> table = new HashMap<>();

    public Log3Stub(){
        table.put(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        table.put(3.0 - 0.01, 0.996960);
        table.put(3.0, 1.0);
        table.put(3.0 + 0.01, 1.003029);

        table.put(0.0 - 0.01, Double.NaN);
        table.put(0.0, Double.NEGATIVE_INFINITY);
        table.put(0.0 + 0.01, -4.1918065);

        table.put(1.0 - 0.01, -0.009148);
        table.put(1.0, 0.0);
        table.put(1.0 + 0.01, 0.009057);
    }

    public Map<Double, Double> getTable() {
        return table;
    }

}
