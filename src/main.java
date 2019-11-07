import functions.equations.EquationsSystem;
import functions.logorithmic.Log2;
import functions.trigonometric.Sin;
import utilities.Writer;

import static java.lang.Math.*;

public class main {
    public static void main(String[] args) {
        /*Sin sin = new Sin();
        System.out.println(sin.calcValue(Double.POSITIVE_INFINITY));
        String[] x1 = {"-PI/2+PI/12", "-PI/5", "-11*PI/2+PI/6"};
        Double[] x1v = {-PI/2+PI/12, -PI/5, -11*PI/2+PI/6};

        for (int i = 0; i < 3; i++)
            System.out.println(x1[i]+ ", " + Math.sin(x1v[i]));

*/
        Writer writer = new Writer(new EquationsSystem());
        writer.write(-10, 10, 1);
    }
}
