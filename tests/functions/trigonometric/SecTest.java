package functions.trigonometric;

import org.junit.Test;
import stub.trigonometric.SecStub;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class SecTest {

    private Sec sec = new Sec();
    private SecStub secStub = new SecStub();
    private Map<Double, Double> stubTable = secStub.getTable();

    private final double DELTA = 1E-6;

    @Test
    //From ( -pi/2 + 2pi*n ; pi/2 + 2pi*n )
    public void checkIntervalOne(){
        assertAll("Test points from ( -pi/2 + 2pi*n ; pi/2 + 2pi*n )",
                () -> assertEquals( stubTable.get(1.0) , sec.calc(1.0) , DELTA),
                () -> assertEquals( stubTable.get(-1.0) , sec.calc(-1.0) , DELTA),
                () -> assertEquals( stubTable.get(0.0) , sec.calc(0.0) , DELTA)
        );
    }

    @Test
    //From ( pi/2 + 2pi*n ; 3pi/2 + 2pi*n )
    public void checkIntervalTwo(){
        assertAll("Test points from ( pi/2 + 2pi*n ; 3pi/2 + 2pi*n )",
                () -> assertEquals( stubTable.get(2.0) , sec.calc(2.0) , DELTA),
                () -> assertEquals( stubTable.get(2.5) , sec.calc(2.5) , DELTA),
                () -> assertEquals( stubTable.get(4.0) , sec.calc(4.0) , DELTA)
        );
    }

    @Test
    public void checkHalfPi(){
        assertEquals( stubTable.get(Math.PI / 2) , sec.calc(Math.PI / 2) , DELTA);
    }

    @Test
    public void checkMinusHalfPi(){
        assertEquals( stubTable.get(-Math.PI / 2) , sec.calc(-Math.PI / 2) , DELTA);
    }

}
