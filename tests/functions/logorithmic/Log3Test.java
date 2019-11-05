package functions.logorithmic;


import org.junit.Test;
import stub.logorithmic.Log3Stub;

import java.util.Map;
import static org.junit.Assert.assertEquals;

public class Log3Test {
    private final double DELTA = 1E-6;
    private Log3 log3 = new Log3();
    private Log3Stub log3Stub = new Log3Stub();
    private Map<Double, Double> stubTable = log3Stub.getTable();

    @Test
    public void checkCloseToOne(){
        assertEquals( stubTable.get(1.0 - 0.01) , log3.calcValue(1.0 - 0.01) , DELTA);
    }

    @Test
    public void checkOne(){
        assertEquals( stubTable.get(1.0) ,log3.calcValue(1.0) , DELTA );
    }

    @Test
    public void checkMoreThanOne(){
        assertEquals( stubTable.get(1.0 + 0.01) , log3.calcValue(1.0 + 0.01) , DELTA);
    }

    @Test
    public void checkCloseToThree(){
        assertEquals( stubTable.get(3.0 - 0.01) , log3.calcValue(3.0 - 0.01) , DELTA);
    }

    @Test
    public void checkThree(){
        assertEquals( stubTable.get(3.0) , log3.calcValue(3.0) , DELTA);
    }

    @Test
    public void checkMoreThanThree(){
        assertEquals( stubTable.get(3.0 + 0.01) , log3.calcValue(3.0 + 0.01) , DELTA);
    }

    @Test
    public void checkCloseToZero(){
        assertEquals( stubTable.get(0.0 - 0.01) , log3.calcValue(0.0 - 0.01) , DELTA);
    }

    @Test
    public void checkZero(){
        assertEquals( stubTable.get(0.0) , log3.calcValue(0.0) , DELTA);
    }

    @Test
    public void checkMoreThanZero(){
        assertEquals( stubTable.get(0.0 + 0.01) , log3.calcValue(0.0 + 0.01) , DELTA);
    }

    @Test
    public void checkInf(){
        assertEquals( stubTable.get(Double.POSITIVE_INFINITY) , log3.calcValue(Double.POSITIVE_INFINITY) , DELTA);
    }
}
