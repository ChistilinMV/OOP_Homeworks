package Task07;

import java.util.Objects;
import java.util.Scanner;

import static Task07.Log.logWrite;

public class Presenter {
    Scanner scanner = new Scanner(System.in);
    View view;
    String numType;
    private String operation;
    private double inFrstNum;
    private double inFrstImaginNum;
    private double inScndNum;
    private double inScndImaginNum;

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

    private void enterComplex() {
        inFrstNum = view.getDoubleValue("Enter the first real number: ");
        inFrstImaginNum = view.getDoubleValue("Enter the first imaginary number: ");
        inScndNum = view.getDoubleValue("Enter the second real number: ");
        inScndImaginNum = view.getDoubleValue("Enter the second imaginary number: ");
    }

    private void enterRational() {
        inFrstNum = view.getDoubleValue("Enter the first rational number: ");
        inScndNum = view.getDoubleValue("Enter the second rational number: ");
    }

    private void selectOperation(Calculating calcNumbers) {
        String result;
        operation = view.getStrValue("Enter operator (+, -, *, /):");
        switch (operation) {
            case "+":
                result = "Sum = " + calcNumbers.sum().toString();
                break;
            case "-":
                result = "Sub = " + calcNumbers.sub().toString();
                break;
            case "*":
                result = "Mul = " + calcNumbers.mul().toString();
                break;
            case "/":
                result = "Div = " + calcNumbers.div().toString();
                break;
            default:
                result = "Entered a correct character";
        }
        System.out.println(result);
        logWrite(result);
    }

    public void menu() {
        while (!Objects.equals(numType, "Q")) {
            numType = view.getStrValue("Enter 1 for Rational or 2 for Complex numbers Q foe Quit: ");
            switch (numType) {
                case "1":
                    enterRational();
                    logWrite("Set the values of rational numbers " +
                            inFrstNum +
                            " and " +
                            inScndNum);
                    selectOperation(new CalculateRational(inFrstNum, inScndNum));
                    break;
                case "2":
                    enterComplex();
                    logWrite("Set the values of complex numbers " +
                            inFrstNum + signedDouble(inFrstImaginNum) + "i" +
                            " and " +
                            inScndNum + signedDouble(inScndImaginNum) + "i");
                    selectOperation(new CalculateComplex(inFrstNum, inFrstImaginNum, inScndNum, inScndImaginNum));
                    break;
                case "Q":
                    view.print("Bye bye");
                    break;
                default:
                    System.out.println("Not a correct type");
            }
        }
    }
}

