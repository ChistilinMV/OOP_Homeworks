package Task07;

public class CalculateComplex extends ComplexNumbers implements Calculating<ComplexNumbers> {
    CalculateComplex(double x, double y) {
        super(x, y);
    }

    CalculateComplex(double x, double xi, double y, double yi) {
        super(x, xi, y, yi);
    }

    @Override
    public ComplexNumbers sum() {
        return new ComplexNumbers((xReal + yReal), (xImagin + yImagin));
    }

    @Override
    public ComplexNumbers sub() {
        return new ComplexNumbers((xReal - yReal), (xImagin - yImagin));
    }

    @Override
    public ComplexNumbers mul() {
        return new ComplexNumbers((xReal * yReal - xImagin * yImagin),
                (xImagin * yReal) + (xReal * yImagin));
    }

    @Override
    public ComplexNumbers div() {
        return new ComplexNumbers((xReal * yReal + xImagin * yImagin) / (yReal * yReal + yImagin * yImagin),
                (xImagin * yReal - xReal * yImagin) / (yReal * yReal + yImagin * yImagin));
    }
}
