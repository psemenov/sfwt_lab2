package functions.equations;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import stub.equations.EquationsSystemStub;

import java.util.Map;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.*;

public class SystemTest {
    private EquationsSystem system = new EquationsSystem();
    private EquationsSystemStub systemStub = new EquationsSystemStub();
    private Map<Double, Double> stubTable = systemStub.getTable();
    private final double DELTA = 1E-6;

    @Test
    public void checkPositive(){
        assertAll("Test system for positive values",
                () -> assertEquals(stubTable.get(3.0), system.calcValue(3.0), DELTA),
                () -> assertEquals(stubTable.get(1.5), system.calcValue(1.5), DELTA),
                () -> assertEquals(stubTable.get(0.5), system.calcValue(0.5), DELTA)
        );
    }

    @Test
    public void checkNegative(){
        assertAll("Test system for negative values",
                () -> assertEquals(stubTable.get(-4.0), system.calcValue(-4.0), DELTA),
                () -> assertEquals(stubTable.get(-1.5), system.calcValue(-1.5), DELTA),
                () -> assertEquals(stubTable.get(-0.5), system.calcValue(-0.5), DELTA)
        );
    }

    @ParameterizedTest
    @ValueSource(doubles = { 1.5 , 2.0 , -3.0 , -1.5})
    public void checkInDomain(double x){
        assertTrue(system.isInDomain(x));
    }

    @ParameterizedTest
    @ValueSource(doubles = { -PI , -PI /2 , 0.0 })
    public void checkNotInDomain(double x){
        assertFalse(system.isInDomain(x));
    }
}
