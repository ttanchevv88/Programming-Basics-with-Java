package WhileLoopLab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sumGrades = 0;
        int years = 1;
        int poorGrateCounter = 0;
        while (years <= 12) {
            if (poorGrateCounter > 1) {
                break;
            }
            double grate = Double.parseDouble(scanner.nextLine());
            if (grate < 4) {
                poorGrateCounter++;
                continue;
            }
            sumGrades = sumGrades + grate;
            years++;
        }
        if (poorGrateCounter > 1) {
            System.out.printf("%s has been excluded at %d grade", name, years);
        } else {
            double averGrade = sumGrades / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, averGrade);
        }
    }
}
