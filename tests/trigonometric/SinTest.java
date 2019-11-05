package trigonometric;

import functions.trigonometric.Sin;
import org.junit.Test;
import org.junit.Assert;

public class SinTest extends Assert {
    Sin sin = new Sin();
    final double DELTA = 1E-6;

    @Test
    public void testMinusPiToMinusHalfPi() {
        for (double x = -Math.PI ; x < -Math.PI/2; x += 0.01)
            assertEquals(Math.sin(x), sin.calc(x), DELTA);
    }
}
