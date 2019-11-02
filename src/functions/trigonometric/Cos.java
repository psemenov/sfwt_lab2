package functions.trigonometric;

import functions.AbstractFunction;

public class Cos extends AbstractFunction {
    private final Sin sin = new Sin();

    @Override
    public double calcValue(double x) {
        return Math.sqrt(1 - Math.pow(sin.calcValue(x), 2));
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
