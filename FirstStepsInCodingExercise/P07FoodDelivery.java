package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double veganMenu = 8.15;
        double delivery = 2.50;

        int countChickenMenu = Integer.parseInt(sc.nextLine());
        int countFishMenu = Integer.parseInt(sc.nextLine());
        int countVeganMenu = Integer.parseInt(sc.nextLine());

        double priceChickenMenu = countChickenMenu * chickenMenu;
        double priceFishMenu = countFishMenu * fishMenu;
        double priceVeganMenu = countVeganMenu * veganMenu;

        double totalSumForMenu = priceChickenMenu + priceFishMenu + priceVeganMenu;

        double priceDessert = totalSumForMenu * 0.20;

        double totalSum = totalSumForMenu + priceDessert + delivery;

        System.out.println(totalSum);


    }
}
