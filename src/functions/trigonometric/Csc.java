package functions.trigonometric;

import functions.AbstractFunction;

public class Csc extends AbstractFunction {
    private final Sin sin = new Sin();

    @Override
    public double calcValue(double x) {
        return 1 / sin.calcValue(x);
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
