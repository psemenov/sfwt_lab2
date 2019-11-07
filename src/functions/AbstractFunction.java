package functions;

public abstract class AbstractFunction {
    public static final double DEFAULT_DELTA = 1E-9;

    public double calc(double x) {
        if (Double.isNaN(x) || !isInDomain(x)) {
            return Double.NaN;
        }
        //System.out.println(x + " : " + calcValue(x) + " " + this.getClass().getSimpleName());
        return calcValue(x);
    }

    public abstract boolean isInDomain(double x);

    public abstract double calcValue(double x);
}
