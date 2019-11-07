package functions.trigonometric;

import functions.AbstractFunction;

public class Tan extends AbstractFunction {
    private final Sin sin = new Sin();

    @Override
    public double calcValue(double x) {
        return sin.calcValue(x) /sin.calcValue(Math.PI/2 - x);
    }

    @Override
    public boolean isInDomain(double x) {
        return Math.abs(x % (Math.PI / 2)) >= DEFAULT_DELTA
                || Math.abs(x % (Math.PI)) <= DEFAULT_DELTA;
    }

}
