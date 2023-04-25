package Task09;

public class ComplexNumber extends NumberValue<ComplexNumber> {
    private double xReal;
    private double xImagin;

    public ComplexNumber(double x) {
        xReal = x;
        xImagin = 0;
    }

    public ComplexNumber(double x, double xi) {
        xReal = x;
        xImagin = xi;
    }

    @Override
    public String toString() {
        return " real " + String.format("%.2f", xReal) +
                " imaginary " + String.format("%.2f", xImagin) +
                'i';
    }

    @Override
    public ComplexNumber sum(ComplexNumber v2) {
        return new ComplexNumber((xReal + v2.xReal), (xImagin + v2.xImagin));
    }

    @Override
    public ComplexNumber sub(ComplexNumber v2) {
        return new ComplexNumber((xReal - v2.xReal), (xImagin - v2.xImagin));
    }

    @Override
    public ComplexNumber mul(ComplexNumber v2) {
        return new ComplexNumber((xReal * v2.xReal - xImagin * v2.xImagin), (xImagin * v2.xReal) + (xReal * v2.xImagin));
    }

    @Override
    public ComplexNumber div(ComplexNumber v2) {
        return new ComplexNumber((xReal * v2.xReal + xImagin * v2.xImagin) / (v2.xReal * v2.xReal + v2.xImagin * v2.xImagin),
                (xImagin * v2.xReal - xReal * v2.xImagin) / (v2.xReal * v2.xReal + v2.xImagin * v2.xImagin));
    }
}
