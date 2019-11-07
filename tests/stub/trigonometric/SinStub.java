package stub.trigonometric;

import functions.trigonometric.Sin;

import java.util.HashMap;
import java.util.Map;
import static java.lang.Math.*;

public class SinStub extends Sin {
    private final Map<Double, Double> table = new HashMap<>();

    public SinStub() {
        //From -2pin to -3/2pin
        table.put(-2*PI+PI/6, 0.5);
        table.put(-2*PI+PI/10, 0.3090169943749476);
        table.put(-3*PI/2-3*PI/8, 0.3826834323650904);

        //From -3/2pin to -pin
        table.put(-PI-PI/10, 0.3090169943749473);
        table.put(-3*PI/2+PI/20, 0.9876883405951377);
        table.put(-3*PI/2+3*PI/4, -0.7071067811865476);

        //From -pin to -pin/2
        table.put(-PI+PI/3,  -0.8660254037844385);
        table.put(-PI/2-PI/10, -0.9510565162951536);
        table.put(-7*PI+PI/4, -0.7071067811865487);

        //From -pin/2 to 0pin
        table.put(-PI/2+PI/12,  -0.9659258262890683);
        table.put(-PI/5, -0.5877852522924731);
        table.put(-11*PI/2+PI/6, 0.8660254037844377);

        //Table values
        table.put(0.0, 0.0);
        table.put(PI / 6, 0.5);
        table.put(PI / 4, Math.sqrt(2) / 2.0);
        table.put(PI / 3, Math.sqrt(3) / 2.0);
        table.put(PI / 2, 1.0);

        table.put(-4.0,0.7568024953079282);
        table.put(-1.5, -0.9974949866040544);
        table.put(-0.5, -0.479425538604203);

        table.put(Double.POSITIVE_INFINITY, Double.NaN);
        table.put(Double.NEGATIVE_INFINITY, Double.NaN);
    }

    public Map<Double, Double> getTable() {
        return table;
    }

    @Override
    public double calcValue(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x)) {
            return Double.NaN;
        }
        return table.get(x);
    }
}
