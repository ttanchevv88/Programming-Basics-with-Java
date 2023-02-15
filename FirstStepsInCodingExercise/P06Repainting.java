package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double nylon = 1.50; //Per square meter
        double color = 14.50; //Per liters
        double thinner = 5.00; //Per liters
        double bags = 0.40; //Price for bags

        double reservNylon = 2;


        double countNylon = Double.parseDouble(sc.nextLine());
        double countColors = Double.parseDouble(sc.nextLine());
        double countThinner = Double.parseDouble(sc.nextLine());
        double countHours = Double.parseDouble(sc.nextLine());

        double priceNylon = (countNylon + reservNylon) * nylon;
        double percentColor = countColors / 10;
        double priceColor = (countColors + percentColor) * color;
        double priceThinner = countThinner * thinner;

        double totalPrice = priceNylon + priceColor + priceThinner + bags;

        double sumForMasters = (totalPrice * 0.30) * countHours;

        double totalSum = totalPrice + sumForMasters;

        System.out.println(totalSum);


    }
}
