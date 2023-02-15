package ConditionalStatementsExercise150123;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmSum = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double clothingSum = Double.parseDouble(scanner.nextLine());

       double decorPrice = filmSum * 0.10;

       if (countStatists > 150){
           clothingSum = clothingSum - (clothingSum * 0.10);
       }

       double clothPrice = clothingSum * countStatists;
       double totalSum = decorPrice + clothPrice;

        if (totalSum >= filmSum) {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more." , Math.abs(filmSum - totalSum));
        } else {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left." , Math.abs(totalSum - filmSum));
        }

    }
}
