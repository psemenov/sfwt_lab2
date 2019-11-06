import functions.equations.EquationsSystem;
import functions.trigonometric.Cos;
import functions.trigonometric.Csc;
import functions.trigonometric.Sec;
import functions.trigonometric.Sin;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        EquationsSystem system = new EquationsSystem();
        System.out.println(system.isInDomain(PI));
    }
}
