package Task07;

public class ComplexNumbers extends ValuesNumber {
    ComplexNumbers(double x, double y) {
        super.xReal = x;
        super.yReal = y;
    }

    ComplexNumbers(double x, double xi, double y, double yi) {
        super.xReal = x;
        super.xImagin = xi;
        super.yReal = y;
        super.yImagin = yi;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ComplexNumbers compNum = (ComplexNumbers) obj;
        return super.xReal == compNum.xReal && super.yReal == compNum.yReal;
    }

    @Override
    public String toString() {
        return "Complex result" +
                " real = " + String.format("%.2f", xReal) +
                " imaginary = " + String.format("%.2f", yReal) +
                'i';
    }
}
