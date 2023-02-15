package FirstStepsInCodingExercise.FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMussels = 7.50;

        double priceMackerel = Double.parseDouble(scanner.nextLine());//Цена на скумрията
        double priceSprinkle = Double.parseDouble(scanner.nextLine());//Цена на цацата
        double kgBonito = Double.parseDouble(scanner.nextLine());//Цена на паламуда
        double kgSafrid = Double.parseDouble(scanner.nextLine());//Килограми сафрид
        double kgMussels = Double.parseDouble(scanner.nextLine());//Килограми миди

        double priceBonito = priceMackerel + priceMackerel * 0.60;
        double sumBonito = priceBonito * kgBonito;

        double priceSafrid = priceSprinkle + priceSprinkle * 0.80;
        double sumSafrid  = priceSafrid * kgSafrid;

        double sumMussels = priceMussels * kgMussels;

        double totalSum = sumBonito + sumSafrid + sumMussels;

        System.out.printf("%.2f", totalSum);
    }
}
