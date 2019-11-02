package functions.trigonometric;

import functions.AbstractFunction;

public class Tan extends AbstractFunction {
    private final Sin sin = new Sin();
    private final Cos cos = new Cos();

    @Override
    public double calcValue(double x) {
        return sin.calcValue(x) / cos.calcValue(x);
    }

    @Override
    public boolean isInDomain(double x) {
        return Math.abs(x % (Math.PI / 2)) >= DEFAULT_DELTA
                || Math.abs(x % (Math.PI)) <= DEFAULT_DELTA;
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
