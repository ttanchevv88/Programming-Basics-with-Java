package FirstStepsInCodingExercise.FirstStepsInCodingMoreExercises;


import java.util.Scanner;

public class P03CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cel = Double.parseDouble(sc.nextLine());

        double result = (cel * 9 / 5) + 32;
        System.out.printf("%.2f", result);
    }
}