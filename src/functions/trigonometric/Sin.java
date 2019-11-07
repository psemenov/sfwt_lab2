package functions.trigonometric;

import functions.AbstractFunction;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Sin extends AbstractFunction {

    @Override
    public double calcValue(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x)) {
            return Double.NaN;
        }

        BigDecimal prevSum;
        BigDecimal currSum = BigDecimal.ZERO;
        int n = 0;
        do {
            prevSum = currSum;
            BigDecimal term = BigDecimal.valueOf(Math.pow(-1, n))
                    .multiply(BigDecimal.valueOf(x).pow(2 * n + 1))
                    .divide(new BigDecimal(factorial(2 * n + 1)), 10, RoundingMode.HALF_UP);
            currSum = currSum.add(term);
            n++;
        } while (prevSum.subtract(currSum).abs().doubleValue() > DEFAULT_DELTA);

        return currSum.doubleValue();
    }

    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    @Override
    public boolean isInDomain(double x) {
        return true;
    }

}
