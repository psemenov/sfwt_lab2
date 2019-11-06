package functions.trigonometric;

import org.junit.Test;
import org.junit.Assert;
import stub.trigonometric.*;

import java.util.Map;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CosTest extends Assert {
    private Cos cos = new Cos();
    private CosStub cosStub = new CosStub();
    private Map<Double, Double> stubTable = cosStub.getTable();

    private final double DELTA = 1E-6;

    @Test
    public void testMinusTwoPinToMinusPinAndAHalf() {
        assertAll("Test points from -2pin to 3/2pin",
                () -> assertEquals(stubTable.get(-2*PI+PI/6), cos.calcValue(-2*PI+PI/6), DELTA),
                () -> assertEquals(stubTable.get(-2*PI+PI/10), cos.calcValue(-2*PI+PI/10), DELTA),
                () -> assertEquals(stubTable.get(-3*PI/2-3*PI/8), cos.calcValue(-3*PI/2-3*PI/8), DELTA)
        );
    }

    @Test
    public void testMinusPinAndAHalfToMinusPin() {
        assertAll("Test points from -3/2pin to -pin",
                () -> assertEquals(stubTable.get(-PI-PI/10), cos.calcValue(-PI-PI/10), DELTA),
                () -> assertEquals(stubTable.get(-3*PI/2+PI/20), cos.calcValue(-3*PI/2+PI/20), DELTA),
                () -> assertEquals(stubTable.get(-3*PI/2+3*PI/4), cos.calcValue(-3*PI/2+3*PI/4), DELTA)
        );
    }

    @Test
    public void testMinusPinToMinusHalfOfPin() {
        assertAll("Test points from -pin to -pin/2",
                () -> assertEquals(stubTable.get(-PI+PI/3), cos.calcValue(-PI+PI/3), DELTA),
                () -> assertEquals(stubTable.get(-PI/2-PI/10), cos.calcValue(-PI/2-PI/10), DELTA),
                () -> assertEquals(stubTable.get(-7*PI+PI/4), cos.calcValue(-7*PI+PI/4), DELTA)
        );
    }

    @Test
    public void testMinusHalfOfPinToZeroPin() {
        assertAll("Test points from -pin/2 to 0pin",
                () -> assertEquals(stubTable.get(-PI/2+PI/12), cos.calcValue(-PI/2+PI/12), DELTA),
                () -> assertEquals(stubTable.get(-PI/5), cos.calcValue(-PI/5), DELTA),
                () -> assertEquals(stubTable.get(-11*PI/2+PI/6), cos.calcValue(-11*PI/2+PI/6), DELTA)
        );
    }

    @Test
    public void testZero() {
        assertEquals(stubTable.get(0.0), cos.calcValue(0.0), DELTA);
    }

    @Test
    public void testPiSixths() {
        assertEquals(stubTable.get(PI/6), cos.calcValue(PI/6), DELTA);
    }

    @Test
    public void testPiFourths() {
        assertEquals(stubTable.get(PI/4), cos.calcValue(PI/4), DELTA);
    }

    @Test
    public void testPiThirds() {
        assertEquals(stubTable.get(PI/3), cos.calcValue(PI/3), DELTA);
    }

    @Test
    public void testHalfOfPi() {
        assertEquals(stubTable.get(PI/2), cos.calcValue(PI/2), DELTA);
    }

    @Test
    public void testPositiveInfinity() {
        assertEquals(stubTable.get(Double.POSITIVE_INFINITY), cos.calcValue(Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testNegativeInfinity() {
        assertEquals(stubTable.get(Double.NEGATIVE_INFINITY), cos.calcValue(Double.NEGATIVE_INFINITY), DELTA);
    }
}
