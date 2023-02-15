package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P05SuppliesforSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double penPack = 5.80;
        double markersPack = 7.20;
        double preparation = 1.20; //Per liters

        double countPackPen = Double.parseDouble(sc.nextLine());
        double countPackMarkers = Double.parseDouble(sc.nextLine());
        double litersPreparation = Double.parseDouble(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());

        double pricePens = countPackPen * penPack;
        double priceMarkers = countPackMarkers * markersPack;
        double pricePreparation = litersPreparation * preparation;

        double totalPrice = pricePens + priceMarkers + pricePreparation;
        double totalPercent = percent / 100;

        double totalSum = totalPrice - (totalPrice * totalPercent);

        System.out.println(totalSum);
    }
}
