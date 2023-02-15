package ConditionalStatementsExercise150123;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double petarMoney = Double.parseDouble(scanner.nextLine());
        int countVideoCards = Integer.parseInt(scanner.nextLine());
        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());

        double sumVideoCards = countVideoCards * 250;
        double priceProcessors = sumVideoCards * 0.35;
        double sumProcessors = priceProcessors * countProcessors;
        double priceRAM = sumVideoCards * 0.10;
        double sumRam = priceRAM * countRAM;

        double totalSum = sumVideoCards + sumProcessors + sumRam;

        if (countVideoCards > countProcessors){
            totalSum = totalSum - totalSum * 0.15;
        }

        if (petarMoney <= totalSum){
            double leftMoney = petarMoney - totalSum;
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(leftMoney));
        }else if (petarMoney > totalSum){
            double leftMoney = petarMoney - totalSum;
            System.out.printf("You have %.2f leva left!", leftMoney);
        }

    }
}
