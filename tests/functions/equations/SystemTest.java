package functions.equations;

import functions.logorithmic.Log2;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import stub.equations.EquationsSystemStub;
import stub.logorithmic.LnStub;
import stub.logorithmic.Log2Stub;
import stub.logorithmic.Log3Stub;
import stub.trigonometric.CscStub;
import stub.trigonometric.SecStub;
import stub.trigonometric.SinStub;
import stub.trigonometric.TanStub;

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
                () -> assertEquals(stubTable.get(3.0), system.calc(3.0), DELTA),
                () -> assertEquals(stubTable.get(1.5), system.calc(1.5), DELTA),
                () -> assertEquals(stubTable.get(0.5), system.calc(0.5), DELTA)
        );
    }

    @Test
    public void checkNegative(){
        assertAll("Test system for negative values",
                () -> assertEquals(stubTable.get(-4.0), system.calc(-4.0), DELTA),
                () -> assertEquals(stubTable.get(-1.5), system.calc(-1.5), DELTA),
                () -> assertEquals(stubTable.get(-0.5), system.calc(-0.5), DELTA)
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

    @Test
    public void TestSystemWithMockedTrigFunctions() {
        EquationsSystem system = new EquationsSystem();
        system.sin = new SinStub();
        system.tan = new TanStub();
        system.csc = new CscStub();
        system.sec = new SecStub();
        assertAll("Test system with mocked trigonometric functions",
                () -> assertEquals(stubTable.get(-4.0), system.calc(-4.0), DELTA),
                () -> assertEquals(stubTable.get(-1.5), system.calc(-1.5), DELTA),
                () -> assertEquals(stubTable.get(-0.5), system.calc(-0.5), DELTA)
        );
    }

    @Test
    public void TestSystemWithMockedSin() {
        EquationsSystem system = new EquationsSystem();
        system.sin = new SinStub();
        assertAll("Test system with mocked sin",
                () -> assertEquals(stubTable.get(-4.0), system.calc(-4.0), DELTA),
                () -> assertEquals(stubTable.get(-1.5), system.calc(-1.5), DELTA),
                () -> assertEquals(stubTable.get(-0.5), system.calc(-0.5), DELTA)
        );
    }

    @Test
    public void TestSystemWithMockedTan() {
        EquationsSystem system = new EquationsSystem();
        system.tan = new TanStub();
        assertAll("Test system with mocked tan",
                () -> assertEquals(stubTable.get(-4.0), system.calc(-4.0), DELTA),
                () -> assertEquals(stubTable.get(-1.5), system.calc(-1.5), DELTA),
                () -> assertEquals(stubTable.get(-0.5), system.calc(-0.5), DELTA)
        );
    }

    @Test
    public void TestSystemWithMockedCsc() {
        EquationsSystem system = new EquationsSystem();
        system.csc = new CscStub();
        assertAll("Test system with mocked csc",
                () -> assertEquals(stubTable.get(-4.0), system.calc(-4.0), DELTA),
                () -> assertEquals(stubTable.get(-1.5), system.calc(-1.5), DELTA),
                () -> assertEquals(stubTable.get(-0.5), system.calc(-0.5), DELTA)
        );
    }

    @Test
    public void TestSystemWithMockedSec() {
        EquationsSystem system = new EquationsSystem();
        system.sec = new SecStub();
        assertAll("Test system with mocked sec",
                () -> assertEquals(stubTable.get(-4.0), system.calc(-4.0), DELTA),
                () -> assertEquals(stubTable.get(-1.5), system.calc(-1.5), DELTA),
                () -> assertEquals(stubTable.get(-0.5), system.calc(-0.5), DELTA)
        );
    }

    @Test
    public void TestSystemWithMockedLogFunctions(){
        EquationsSystem system = new EquationsSystem();
        system.ln = new LnStub();
        system.log2 = new Log2Stub();
        system.log3 = new Log3Stub();
        assertAll("Test system with mocked logarithmic functions",
                () -> assertEquals(stubTable.get(3.0), system.calc(3.0), DELTA),
                () -> assertEquals(stubTable.get(1.5), system.calc(1.5), DELTA),
                () -> assertEquals(stubTable.get(0.5), system.calc(0.5), DELTA)
        );
    }

    @Test
    public void TestSystemWithMockedLn(){
        EquationsSystem system = new EquationsSystem();
        system.ln = new LnStub();
        assertAll("Test system with mocked ln",
                () -> assertEquals(stubTable.get(3.0), system.calc(3.0), DELTA),
                () -> assertEquals(stubTable.get(1.5), system.calc(1.5), DELTA),
                () -> assertEquals(stubTable.get(0.5), system.calc(0.5), DELTA)
        );
    }

    @Test
    public void TestSystemWithMockedLog2(){
        EquationsSystem system = new EquationsSystem();
        system.log2 = new Log2Stub();
        assertAll("Test system with mocked log2",
                () -> assertEquals(stubTable.get(3.0), system.calc(3.0), DELTA),
                () -> assertEquals(stubTable.get(1.5), system.calc(1.5), DELTA),
                () -> assertEquals(stubTable.get(0.5), system.calc(0.5), DELTA)
        );
    }

    @Test
    public void TestSystemWithMockedLog3(){
        EquationsSystem system = new EquationsSystem();
        system.log3 = new Log3Stub();
        assertAll("Test system with mocked log3",
                () -> assertEquals(stubTable.get(3.0), system.calc(3.0), DELTA),
                () -> assertEquals(stubTable.get(1.5), system.calc(1.5), DELTA),
                () -> assertEquals(stubTable.get(0.5), system.calc(0.5), DELTA)
        );
    }

}
