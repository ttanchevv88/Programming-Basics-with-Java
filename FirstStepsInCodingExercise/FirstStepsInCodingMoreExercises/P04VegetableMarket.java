package FirstStepsInCodingExercise.FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euro = 1.94;

        double priceVegetables = Double.parseDouble(sc.nextLine());
        double priceFruits = Double.parseDouble(sc.nextLine());
        double kgVega = Double.parseDouble(sc.nextLine());
        double kgFru = Double.parseDouble(sc.nextLine());

        double sumVega = priceVegetables * kgVega;
        double sumFru = priceFruits * kgFru;

        double totalSum = sumVega + sumFru;
        double toEuro = totalSum / euro;

        System.out.printf("%.2f", toEuro);

    }
}