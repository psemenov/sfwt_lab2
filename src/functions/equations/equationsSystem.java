package functions.equations;

import functions.AbstractFunction;
import functions.logorithmic.Ln;
import functions.logorithmic.Log2;
import functions.logorithmic.Log3;

public class equationsSystem extends AbstractFunction {
    private final Ln ln = new Ln();
    private final Log2 log2 = new Log2();
    private final Log3 log3 = new Log3();
    private final Sin sin = new Sin();
    private final Tan tan = new Tan();
    private final Csc csc = new Csc();
    private final Sec sec = new Sec();

    @Override
    protected double calcValue(double x) {
        return x > 0 ? function2(x) : function1(x);
    }

    private double function1(double x) {
        return Math.pow(Math.pow(sin.calc(x),3) - tan.calc(x) + Math.pow(sec.calc(x),2),3) * ((tan.calc(x) - tan.calc(x))/(csc.calc(x)));
    }

    private double function2(double x) {
        return Math.pow((((log3.calc(x)-ln.calc(x))+log2.calc(x))/(log2.calc(x))) * Math.pow(log3.calc(x),3),2);
    }

    //TODO redo domain
    @Override
    public boolean isInDomain(double x) {
        return (x <= 0 && cot.isInDomain(x) && tan.isInDomain(x)) || (x > 0 && x != 1);
    }

    @Override
    public Boolean getParityStatus() {
        return null;
    }

    @Override
    public Double getPeriod() {
        return null;
    }
}
