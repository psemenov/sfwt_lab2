package functions.trigonometric;

import org.junit.Test;
import stub.trigonometric.TanStub;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class TanTest {

    private Tan tan = new Tan();
    private TanStub tanStub = new TanStub();
    private Map<Double, Double> stubTable = tanStub.getTable();

    private final double DELTA = 1E-6;

    @Test
    public void checkZero(){
        assertEquals( stubTable.get(0.0) , tan.calc(0) , DELTA);
    }

    @Test
    public void checkHalfPi(){
        assertEquals( stubTable.get(Math.PI / 2) , tan.calc(Math.PI / 2) , DELTA);
    }

    @Test
    public void checkMinusHalfPi(){
        assertEquals( stubTable.get(-Math.PI / 2) , tan.calc(Math.PI / 2) , DELTA);
    }


    @Test
    public void checkFromZeroToHalfPI(){
        assertAll("Test points from 0 to pi/2",
                () -> assertEquals( stubTable.get(Math.PI / 6) , tan.calc(Math.PI / 6) , DELTA),
                () -> assertEquals( stubTable.get(Math.PI / 4) , tan.calc(Math.PI / 4) , DELTA),
                () -> assertEquals( stubTable.get(Math.PI / 3) , tan.calc(Math.PI / 3) , DELTA)
        );
    }

    @Test
    public void checkFromZeroToMinusHalfPi(){
        assertAll("Test points from 0 to -pi/2",
                () -> assertEquals( stubTable.get(-Math.PI / 6) , tan.calc(-Math.PI / 6) , DELTA),
                () -> assertEquals( stubTable.get(-Math.PI / 4) , tan.calc(-Math.PI / 4) , DELTA),
                () -> assertEquals( stubTable.get(-Math.PI / 3) , tan.calc(-Math.PI / 3) , DELTA)
        );
    }

    @Test
    public void checkMoreThanHalfPi(){
        assertEquals( stubTable.get(4.0) , tan.calc(4.0) , DELTA);
    }

    @Test
    public void checkLowerThanHalfPi(){
        assertEquals( stubTable.get(4.0) , tan.calc(4.0) , DELTA);
    }

}
