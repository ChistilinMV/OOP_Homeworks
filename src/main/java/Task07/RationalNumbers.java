package Task07;

public class RationalNumbers extends ValuesNumber {
    public RationalNumbers(double x, double y) {
        super.xReal = x;
        super.yReal = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        RationalNumbers rationNum = (RationalNumbers) obj;
        return super.xReal == rationNum.xReal && super.yReal == rationNum.yReal;
    }

    @Override
    public String toString() {
        return "Rational result" +
                " = " + String.format("%.2f", xReal);
    }
}
