package functions.trigonometric;

import functions.AbstractFunction;

public class Csc extends AbstractFunction {
    private final Sin sin = new Sin();

    @Override
    public double calcValue(double x) {
        double sinValue = sin.calcValue(x);
        double result = 1 / sinValue;
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
