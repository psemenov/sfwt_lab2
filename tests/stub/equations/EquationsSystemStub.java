package stub.equations;

import java.util.HashMap;
import java.util.Map;
import static java.lang.Math.*;

public class EquationsSystemStub {
    private final Map<Double, Double> table = new HashMap<>();

    public EquationsSystemStub() {
        table.put(3.0 , 0.879436154);
        table.put(1.5 , 0.00222259);
        table.put(0.5 , 0.0554741);
        table.put(-4.0 , 0.0);
        table.put(-1.5 , 0.0);
        table.put(-0.5 , 0.0);
    }

    public Map<Double, Double> getTable() {
        return table;
    }
}
