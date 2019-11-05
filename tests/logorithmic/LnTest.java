package logorithmic;

import functions.logorithmic.Ln;
import org.junit.Test;
import stub.logorithmic.LnStub;

import java.util.Map;
import static org.junit.Assert.assertEquals;

public class LnTest {
    final double DELTA = 1E-6;
    Ln ln = new Ln();
    LnStub lnStub = new LnStub();
    Map<Double, Double> stubTable = lnStub.getTable();

    @Test
    public void checkCloseToOne(){
        assertEquals( stubTable.get(1.0 - 0.01) , ln.calcValue(1.0 - 0.01) , DELTA);
    }

    @Test
    public void checkOne(){
        assertEquals( stubTable.get(1.0) ,ln.calcValue(1.0) , DELTA );
    }

    @Test
    public void checkMoreThanOne(){
        assertEquals( stubTable.get(1.0 + 0.01) , ln.calcValue(1.0 + 0.01) , DELTA);
    }

    @Test
    public void checkCloseToE(){
        assertEquals( stubTable.get(Math.E - 0.01) , ln.calcValue(Math.E - 0.01) , DELTA);
    }

    @Test
    public void checkE(){
        assertEquals( stubTable.get(Math.E) , ln.calcValue(Math.E) , DELTA);
    }

    @Test
    public void checkMoreThanE(){
        assertEquals( stubTable.get(Math.E + 0.01) , ln.calcValue(Math.E + 0.01) , DELTA);
    }

    @Test
    public void checkCloseToZero(){
        assertEquals( stubTable.get(0.0 - 0.01) , ln.calcValue(0.0 - 0.01) , DELTA);
    }

    @Test
    public void checkZero(){
        assertEquals( stubTable.get(0.0) , ln.calcValue(0.0) , DELTA);
    }

    @Test
    public void checkMoreThanZero(){
        assertEquals( stubTable.get(0.0 + 0.01) , ln.calcValue(0.0 + 0.01) , DELTA);
    }

    @Test
    public void checkInf(){
        assertEquals( stubTable.get(Double.POSITIVE_INFINITY) , ln.calcValue(Double.POSITIVE_INFINITY) , DELTA);
    }
}
