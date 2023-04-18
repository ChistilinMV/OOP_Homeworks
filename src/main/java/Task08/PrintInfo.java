package Task08;

import java.util.List;

public class PrintInfo {
    public static void printInfo(String nameFirst, List<Person> nameSecond) {
        if (nameFirst != null || nameSecond != null) {
            System.out.println("Parens of " + nameFirst + ": " + nameSecond);
        } else {
            System.out.println("Some person not found");
        }
    }
}
