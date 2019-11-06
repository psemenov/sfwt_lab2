package functions.trigonometric;

import org.junit.Test;
import stub.trigonometric.CscStub;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CscTest {

    private Csc csc = new Csc();
    private CscStub cscStub = new CscStub();
    private Map<Double, Double> stubTable = cscStub.getTable();

    private final double DELTA = 1E-6;

    @Test
    //From ( 0 + 2pi*n ; pi + 2pi*n )
    public void checkIntervalOne(){
        assertAll("Test points from ( 0 + 2pi*n ; pi + 2pi*n )",
                () -> assertEquals( stubTable.get(1.0) , csc.calc(1.0) , DELTA),
                () -> assertEquals( stubTable.get(1.2) , csc.calc(1.2) , DELTA),
                () -> assertEquals( stubTable.get(0.5) , csc.calc(0.5) , DELTA)
        );
    }

    @Test
    //From ( -pi + 2pi*n ; 0 + 2pi*n )
    public void checkIntervalTwo(){
        assertAll("Test points from ( -pi + 2pi*n ; 0 + 2pi*n )",
                () -> assertEquals( stubTable.get(-1.0) , csc.calc(-1.0) , DELTA),
                () -> assertEquals( stubTable.get(-1.2) , csc.calc(-1.2) , DELTA),
                () -> assertEquals( stubTable.get(-0.5) , csc.calc(-0.5) , DELTA)
        );
    }

    @Test
    public void checkHalfPi(){
        assertEquals( stubTable.get(Math.PI) , csc.calc(Math.PI) , DELTA);
    }

    @Test
    public void checkMinusHalfPi(){
        assertEquals( stubTable.get(-Math.PI) , csc.calc(-Math.PI) , DELTA);
    }

}
