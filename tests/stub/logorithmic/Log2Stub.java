package stub.logorithmic;

import java.util.HashMap;
import java.util.Map;

public class Log2Stub {

    private final Map<Double, Double> table = new HashMap<>();

    public Log2Stub(){
        table.put(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        table.put(2.0 - 0.01, 0.992768);
        table.put(2.0, 1.0);
        table.put(2.0 + 0.01, 1.0071955014);

        table.put(0.0 - 0.01, Double.NaN);
        table.put(0.0, Double.NaN);
        table.put(0.0 + 0.01, -6.64385618977);

        table.put(1.0 - 0.01, -0.0144996);
        table.put(1.0, 0.0);
        table.put(1.0 + 0.01, 0.0143553);
    }

    public Map<Double, Double> getTable() {
        return table;
    }

}
