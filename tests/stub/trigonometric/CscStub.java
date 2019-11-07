package stub.trigonometric;

import functions.trigonometric.Csc;

import java.util.HashMap;
import java.util.Map;
import static java.lang.Math.*;

public class CscStub extends Csc {
    private final Map<Double, Double> table = new HashMap<>();

    public CscStub() {

        //From ( 0 + 2pi*n ; pi + 2pi*n )
        table.put(1.0 , 1.18839510578);
        table.put(1.2 , 1.07291637771);
        table.put(0.5 , 2.08582964293);

        //From ( -pi + 2pi*n ; 0 + 2pi*n )
        table.put(-1.0 , -1.18839510578);
        table.put(-1.2 , -1.07291637771);
        table.put(-0.5 , -2.08582964293);

        //Pi/2
        table.put(Math.PI  , Double.NaN);

        //-Pi/2
        table.put(-Math.PI , Double.NaN);

        table.put(-4.0,1.3213487088109024);
        table.put(-1.5, -1.0025113042467249);
    }

    public Map<Double, Double> getTable() {
        return table;
    }

    @Override
    public double calcValue(double x) {
        return table.get(x);
    }
}
