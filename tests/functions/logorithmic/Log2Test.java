package functions.logorithmic;

import org.junit.Test;
import stub.logorithmic.Log2Stub;


import java.util.Map;
import static org.junit.Assert.assertEquals;

public class Log2Test {
    private final double DELTA = 1E-6;
    private Log2 log2 = new Log2();
    private Log2Stub Log2Stub = new Log2Stub();
    private Map<Double, Double> stubTable = Log2Stub.getTable();

    @Test
    public void checkCloseToOne(){
        assertEquals( stubTable.get(1.0 - 0.01) , log2.calcValue(1.0 - 0.01) , DELTA);
    }

    @Test
    public void checkOne(){
        assertEquals( stubTable.get(1.0) ,log2.calcValue(1.0) , DELTA );
    }

    @Test
    public void checkMoreThanOne(){
        assertEquals( stubTable.get(1.0 + 0.01) , log2.calcValue(1.0 + 0.01) , DELTA);
    }

    @Test
    public void checkCloseToTwo(){
        assertEquals( stubTable.get(2.0 - 0.01) , log2.calcValue(2.0 - 0.01) , DELTA);
    }

    @Test
    public void checkTwo(){
        assertEquals( stubTable.get(2.0) , log2.calcValue(2.0) , DELTA);
    }

    @Test
    public void checkMoreThanTwo(){
        assertEquals( stubTable.get(2.0 + 0.01) , log2.calcValue(2.0 + 0.01) , DELTA);
    }

    @Test
    public void checkCloseToZero(){
        assertEquals( stubTable.get(0.0 - 0.01) , log2.calcValue(0.0 - 0.01) , DELTA);
    }

    @Test
    public void checkZero(){
        assertEquals( stubTable.get(0.0) , log2.calcValue(0.0) , DELTA);
    }

    @Test
    public void checkMoreThanZero(){
        assertEquals( stubTable.get(0.0 + 0.01) , log2.calcValue(0.0 + 0.01) , DELTA);
    }

    @Test
    public void checkInf(){
        assertEquals( stubTable.get(Double.POSITIVE_INFINITY) , log2.calcValue(Double.POSITIVE_INFINITY) , DELTA);
    }
}
