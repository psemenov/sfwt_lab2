package functions.trigonometric;

import functions.AbstractFunction;


public class Sec extends AbstractFunction {
    private final Sin sin = new Sin();

    @Override
    public double calcValue(double x) {
        double result = 1 / sin.calcValue(Math.PI/2 - x);
        return result > 1e7 || result < -1e7 ? Double.NaN : result ;
    }

    @Override
    public boolean isInDomain(double x) {
        return Math.abs(x % (Math.PI / 2)) != 0.0 || x == 0.0;
    }

}
