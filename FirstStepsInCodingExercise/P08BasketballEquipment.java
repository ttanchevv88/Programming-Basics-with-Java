package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double feePerYears = Double.parseDouble(sc.nextLine());

        double basketballShoes = feePerYears - (feePerYears * 0.40);
        double basketballOutfit = basketballShoes - (basketballShoes * 0.20) ;
        double basketballBall = basketballOutfit / 4;
        double basketballAccessories = basketballBall / 5;

        double totalSum = feePerYears + basketballShoes + basketballOutfit + basketballBall + basketballAccessories;

        System.out.println(totalSum);

    }
}
