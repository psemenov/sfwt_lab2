import functions.equations.EquationsSystem;
import functions.trigonometric.Cos;
import functions.trigonometric.Csc;
import functions.trigonometric.Sec;
import functions.trigonometric.Sin;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        final double DEFAULT_DELTA = 1E-9;
        Sec sec = new Sec();
        Cos cos = new Cos();
       // System.out.println( 1 / cos.calcValue(0));
       // System.out.println(sec.isInDomain(0));
        System.out.println(Math.abs(0.0 % (Math.PI / 2)));
    }
}
