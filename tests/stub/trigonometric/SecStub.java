package stub.trigonometric;

import java.util.HashMap;
import java.util.Map;
import static java.lang.Math.*;

public class SecStub {
    private final Map<Double, Double> table = new HashMap<>();

    public SecStub() {

        //From ( -pi/2 + 2pi*n ; pi/2 + 2pi*n )
        table.put(1.0 , 1.85081571768);
        table.put(-1.0 , 1.85081571768);
        table.put(0.0 , 1.0);

        //From ( pi/2 + 2pi*n ; 3pi/2 + 2pi*n )
        table.put(2.0 , -2.40299796172);
        table.put(4.0 , -1.52988565647);
        table.put(2.5 , -1.24821565147);

        //Pi/2
        table.put(Math.PI / 2 , Double.NaN);

        //-Pi/2
        table.put(-Math.PI / 2 , Double.NaN);
    }

    public Map<Double, Double> getTable() {
        return table;
    }
}
