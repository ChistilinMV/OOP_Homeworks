package Task09;

import java.util.ArrayList;
import java.util.List;

public class ComplexNumberFactory extends NumberFactory {
    static {
        registerType(new ComplexNumberFactory());
    }

    public String getMenuItem() {
        return "Complex";
    }

    public List<String> getInputValueLabels() {
        return new ArrayList<String>() {{
            add("Enter the real number: ");
            add("Enter the imaginary number: ");
        }};
    }

    @Override
    public ComplexNumber createNumber(List<Double> values) {
        return new ComplexNumber(values.get(0), values.get(1));
    }
}
