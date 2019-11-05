package stub.trigonometric;

import java.util.HashMap;
import java.util.Map;
import static java.lang.Math.*;

public class CosStub {
    private final Map<Double, Double> table = new HashMap<>();

    public CosStub() {
        //From -2pin to -3/2pin
        table.put(-2*PI+PI/6, 0.8660254037844384);
        table.put(-2*PI+PI/10, 0.9510565162951535);
        table.put(-3*PI/2-3*PI/8, 0.9238795325112865);

        //From -3/2pin to -pin
        table.put(-PI-PI/10, -0.9510565162951536);
        table.put(-3*PI/2+PI/20, -0.15643446504023104);
        table.put(-3*PI/2+3*PI/4, -0.7071067811865475);

        //From -pin to -pin/2
        table.put(-PI+PI/3,  -0.5);
        table.put(-PI/2-PI/10, -0.30901699437494734);
        table.put(-7*PI+PI/4, -0.7071067811865464);

        //From -pin/2 to 0pin
        table.put(-PI/2+PI/12,  0.25881904510252074);
        table.put(-PI/5, 0.8090169943749475);
        table.put(-11*PI/2+PI/6, -0.5);

        //Table values
        table.put(0.0, 1.0);
        table.put(PI / 6, Math.sqrt(3) / 2.0);
        table.put(PI / 4, Math.sqrt(2) / 2.0);
        table.put(PI / 3, 0.5);
        table.put(PI / 2, 0.0);

        table.put(Double.POSITIVE_INFINITY, Double.NaN);
        table.put(Double.NEGATIVE_INFINITY, Double.NaN);
    }

    public Map<Double, Double> getTable() {
        return table;
    }
}
