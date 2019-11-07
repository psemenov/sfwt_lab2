package functions.equations;
import functions.trigonometric.*;

import functions.AbstractFunction;
import functions.logorithmic.Ln;
import functions.logorithmic.Log2;
import functions.logorithmic.Log3;

public class EquationsSystem extends AbstractFunction {
    public Ln ln = new Ln();
    public Log2 log2 = new Log2();
    public Log3 log3 = new Log3();
    public Sin sin = new Sin();
    public Tan tan = new Tan();
    public Csc csc = new Csc();
    public Sec sec = new Sec();

    @Override
    public double calcValue(double x) {
        return x > 0 ? function2(x) : function1(x);
    }

    private double function1(double x) {
        return Math.pow(Math.pow(sin.calc(x),3) - tan.calc(x) + Math.pow(sec.calc(x),2),3) * ((tan.calc(x) - tan.calc(x))/(csc.calc(x)));
    }

    private double function2(double x) {
        return Math.pow((((log3.calc(x)-ln.calc(x))+log2.calc(x))/(log2.calc(x))) * Math.pow(log3.calc(x),3),2);
    }

    @Override
    public boolean isInDomain(double x) {
        return x > 0 || tan.isInDomain(x) && sec.isInDomain(x) && csc.isInDomain(x);
    }
}
