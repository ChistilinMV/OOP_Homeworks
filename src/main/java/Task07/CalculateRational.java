package Task07;

public class CalculateRational extends RationalNumbers implements Calculating<RationalNumbers> {
    public CalculateRational(double x, double y) {
        super(x, y);
    }

    @Override
    public RationalNumbers sum() {
        return new RationalNumbers(xReal + yReal, 0);
    }

    @Override
    public RationalNumbers sub() {
        return new RationalNumbers(xReal - yReal, 0);
    }

    @Override
    public RationalNumbers mul() {
        return new RationalNumbers(xReal * yReal, 0);
    }

    @Override
    public RationalNumbers div() {
        return new RationalNumbers(xReal / yReal, 0);
    }
}
