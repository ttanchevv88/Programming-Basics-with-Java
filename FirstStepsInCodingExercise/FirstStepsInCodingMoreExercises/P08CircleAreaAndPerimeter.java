package FirstStepsInCodingExercise.FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numb = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * numb * numb;
        double perimeter = 2 * Math.PI * numb;

        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", perimeter);

    }
}
