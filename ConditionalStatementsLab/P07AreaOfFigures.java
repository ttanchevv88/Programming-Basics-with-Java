package ConditionalStatementsLab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        double area = 0;

        if (figure.equals("square")){
            double sideSquare = Double.parseDouble(scanner.nextLine());
            area = sideSquare * sideSquare;
        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());

            area = sideA * sideB;
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());

            area = Math.PI * radius * radius;
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = (a * h) / 2;
        }

        System.out.printf("%.3f", area);
    }
}
