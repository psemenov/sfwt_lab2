import functions.trigonometric.Sin;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Sin sin = new Sin();
        System.out.println(sin.calcValue(Double.POSITIVE_INFINITY));
        String[] x1 = {"-PI/2+PI/12", "-PI/5", "-11*PI/2+PI/6"};
        Double[] x1v = {-PI/2+PI/12, -PI/5, -11*PI/2+PI/6};

        for (int i = 0; i < 3; i++)
            System.out.println(x1[i]+ ", " + Math.sin(x1v[i]));

    }
}
