package functions;

public abstract class AbstractFunction {
    public static final double DEFAULT_DELTA = 1E-6;

    public double calc(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x) || !isInDomain(x)) {
            return Double.NaN;
        }
        return calcValue(x);
    }

    public abstract boolean isInDomain(double x);

    public abstract Boolean getParityStatus();

    public abstract Double getPeriod();

    protected abstract double calcValue(double x);
}
