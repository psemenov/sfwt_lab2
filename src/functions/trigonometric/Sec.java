package functions.trigonometric;

import functions.AbstractFunction;


public class Sec extends AbstractFunction {
    private final Cos cos = new Cos();

    @Override
    public double calcValue(double x) {
        double cosValue = cos.calcValue(x);
        double result = 1 / cosValue;
        return result > 1e7 || result < -1e7 ? Double.NaN : result ;
    }

    @Override
    public boolean isInDomain(double x) {
        return true;
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
