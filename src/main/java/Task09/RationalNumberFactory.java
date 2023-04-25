package Task09;

import java.util.ArrayList;
import java.util.List;

public class RationalNumberFactory extends NumberFactory {
    static {
        registerType(new RationalNumberFactory());
    }

    public String getMenuItem() {
        return "Rational";
    }

    public List<String> getInputValueLabels() {
        return new ArrayList<String>() {{
            add("Enter the rational number: ");
        }};
    }

    @Override
    public RationalNumber createNumber(List<Double> values) {
        return new RationalNumber(values.get(0));
    }
}
