package functions.logorithmic;

import functions.AbstractFunction;
import functions.logorithmic.Ln;

public class Log2 extends AbstractFunction {
    private final Ln ln = new Ln();

    @Override
    public double calcValue(double x) {
        return ln.calc(x) / ln.calc(2);
    }

    @Override
    public boolean isInDomain(double x) {
        return ln.isInDomain(x);
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
