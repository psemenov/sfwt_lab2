package functions.trigonometric;

import functions.AbstractFunction;

public class Sec extends AbstractFunction {
    private final Cos cos = new Cos();

    @Override
    public double calcValue(double x) {
        return 1 / cos.calcValue(x);
    }

    @Override
    public boolean isInDomain(double x) {
        return false;
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
