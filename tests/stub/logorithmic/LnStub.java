package stub.logorithmic;

import functions.logorithmic.Ln;

import java.util.HashMap;
import java.util.Map;

public class LnStub extends Ln {

    private final Map<Double, Double> table = new HashMap<>();

    public LnStub(){
        table.put(1.0 - 0.01, -0.010050000000000009);
        table.put(1.0, 0.0);
        table.put(1.0 + 0.01, 0.00995000000000001);
        table.put(Math.E - 0.01, 0.996314422);
        table.put(Math.E,1d);
        table.put(Math.E + 0.01, 1.003672044);
        table.put(0.0 - 0.01, Double.NaN);
        table.put(0.0, Double.NaN);
        table.put(0.0 + 0.01, -4.60517018599);
        table.put(Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY);

        table.put(3.0, 1.098612288668);
        table.put(1.5, 0.405465108108);
        table.put(0.5, -0.69314718055);
    }

    public Map<Double, Double> getTable() {
        return table;
    }

    @Override
    public double calcValue(double x) {
        return table.get(x);
    }
}
