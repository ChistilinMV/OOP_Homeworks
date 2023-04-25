package Task09;

public class RationalNumber extends NumberValue<RationalNumber> {
    private double xRational;

    public RationalNumber(double x) {
        this.xRational = x;
    }

    @Override
    public String toString() {
        return String.format("%.2f", xRational);
    }

    @Override
    public RationalNumber sum(RationalNumber v2) {
        return new RationalNumber(xRational + v2.xRational);
    }

    @Override
    public RationalNumber sub(RationalNumber v2) {
        return new RationalNumber(xRational - v2.xRational);
    }

    @Override
    public RationalNumber mul(RationalNumber v2) {
        return new RationalNumber(xRational * v2.xRational);
    }

    @Override
    public RationalNumber div(RationalNumber v2) {
        return new RationalNumber(xRational / v2.xRational);
    }
}
