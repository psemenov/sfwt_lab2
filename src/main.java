import functions.trigonometric.Cos;
import functions.trigonometric.Sec;
import functions.trigonometric.Sin;
import static java.lang.Math.*;

public class main {
    public static void main(String[] args) {
        Cos cos = new Cos();
       // System.out.println(cos.calcValue(Double.POSITIVE_INFINITY));
        String[] x1 = {"-PI/2+PI/12", "-PI/5", "-11*PI/2+PI/6"};
        Double[] x1v = {-PI/2+PI/12, -PI/5, -11*PI/2+PI/6};

//        for (int i = 0; i < 3; i++)
//            System.out.println(x1[i]+ ", " + Math.cos(x1v[i]));
        Sec sec = new Sec();
       // sec.calcValue(3*Math.PI / 2 );
       // System.out.println(1.0/0.0);
        System.out.println(sec.calcValue(3*Math.PI / 2 ));
    }
}
