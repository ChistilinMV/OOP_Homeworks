package Task09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Task07.Log.logWrite;

public class Presenter {
    private View view;
    private String operation;

    public Presenter(View view) {
        this.view = view;
    }

    private String signedDouble(double number) {
        if (number < 0) {
            return " - " + Math.abs(number);
        } else {
            return " + " + number;
        }
    }

    public void menu() {
        while (true) {
            List<NumberFactory> items = NumberFactory.getRegisteredTypes();
            String menu = "";
            for (int i = 0; i < items.size(); i++) {
                menu += "Enter " + i + " for " + items.get(i).getMenuItem() + "\n";
            }
            menu += "Enter Q for quit > ";
            String menuResult = view.inputStrValue(menu);
            if ("Q".equals(menuResult)) break;
            NumberFactory nf = items.get(Integer.parseInt(menuResult));
            List<String> labels = nf.getInputValueLabels();
            List<Double> inputs = new ArrayList<>(labels.size());
            for (String label : labels) {
                inputs.add(view.inputDoubleValue(label));
            }
            NumberValue v1 = nf.createNumber(inputs);

            inputs.clear();
            for (String label : labels) {
                inputs.add(view.inputDoubleValue(label));
            }
            NumberValue v2 = nf.createNumber(inputs);
            logWrite("Set the values of " + nf.getMenuItem() + " numbers " +
                    v1 + " and " +
                    v2);
            String result;
            operation = view.inputStrValue("Enter operator (+, -, *, /):");
            switch (operation) {
                case "+":
                    result = "Sum = " + v1.sum(v2).toString();
                    break;
                case "-":
                    result = "Sub = " + v1.sub(v2).toString();
                    break;
                case "*":
                    result = "Mul = " + v1.mul(v2).toString();
                    break;
                case "/":
                    result = "Div = " + v1.div(v2).toString();
                    break;
                default:
                    result = "Entered a correct character";
            }
            System.out.println(result);
            logWrite(result);
        }
    }
}

