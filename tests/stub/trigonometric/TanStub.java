package stub.trigonometric;

import java.util.HashMap;
import java.util.Map;
import static java.lang.Math.*;

public class TanStub {
    private final Map<Double, Double> table = new HashMap<>();

    public TanStub() {
        // 0
        table.put(0.0 , 0.0);

        // PI/2
        table.put(Math.PI / 2, Double.NaN);

        // -PI/2
        table.put(-Math.PI / 2, Double.NaN);

        //From 0 to PI/2
        table.put(Math.PI / 6, Math.sqrt(3) / 3);
        table.put(Math.PI / 4, 1.0);
        table.put(Math.PI / 3, Math.sqrt(3));

        //From 0 to -PI/2
        table.put(-Math.PI / 6, - Math.sqrt(3) / 3);
        table.put(-Math.PI / 4, -1.0);
        table.put(-Math.PI / 3, -Math.sqrt(3));

        //More than PI/2
        table.put( 4.0 , 1.15782128235);

        //Lower than -PI/2
        table.put( -4.0 , -1.15782128235);
    }

    public Map<Double, Double> getTable() {
        return table;
    }
}
