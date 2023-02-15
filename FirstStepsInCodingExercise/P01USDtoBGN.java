package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P01USDtoBGN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double bgn = Double.parseDouble(scanner.nextLine());
        double usd = 1.79549;

        double result = bgn * usd;
        System.out.println(result);
    }

}
