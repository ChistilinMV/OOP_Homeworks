package Task09;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberFactory {
    static private List<NumberFactory> registeredTypes = new ArrayList<>();

    static List<NumberFactory> getRegisteredTypes() {
        return registeredTypes;
    }

    static protected void registerType(NumberFactory n) {
        registeredTypes.add(n);
    }

    public abstract String getMenuItem();

    public abstract List<String> getInputValueLabels();

    public abstract NumberValue createNumber(List<Double> values);

}
