package FirstStepsInCodingExercise.FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());

        double area = a * h / 2;

        System.out.printf("%.2f", area);
    }
}