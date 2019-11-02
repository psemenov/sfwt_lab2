package functions.logorithmic;

import functions.AbstractFunction;

public class Ln extends AbstractFunction {

    @Override
    public double calcValue(double x){
        double realX = (x-1)/(x+1);
        double accumulator = 0;
        double prevValue;
        double n = 1;
        do {
            prevValue = accumulator;
            double term = Math.pow(realX , n) / n;
            accumulator += term;
            n += 2;
        } while(Math.abs(accumulator - prevValue) > AbstractFunction.DEFAULT_DELTA);

        return accumulator * 2;
    }

    @Override
    public boolean isInDomain(double x) {
        return x > 0;
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