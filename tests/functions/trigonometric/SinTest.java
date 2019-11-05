package functions.trigonometric;

import org.junit.Test;
import org.junit.Assert;

public class SinTest extends Assert {
    Sin sin = new Sin();
    final double DELTA = 1E-9;

    @Test
    public void testMinusPiToMinusHalfPi() {
        for (double x = -Math.PI ; x < -Math.PI/2; x += 0.1)
            assertEquals(Math.sin(x), sin.calc(x), DELTA);
    }
}
