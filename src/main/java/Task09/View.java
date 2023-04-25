package Task09;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double inputDoubleValue(String title) {
        System.out.printf("%s", title);
        while (!in.hasNextDouble()) {
            print("input ERROR\n");
            in.next();
        }
        return in.nextDouble();
    }

    public String inputStrValue(String title) {
        System.out.printf("%s", title);
        return in.next();
    }

    public void printData(Integer data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public void print(String title) {
        System.out.print(title);
    }
}
