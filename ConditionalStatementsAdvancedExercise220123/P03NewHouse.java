package ConditionalStatementsAdvancedExercise220123;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double sumOfRoses = 0;
        double sumOfDahlias = 0;
        double sumOfTulips = 0;
        double sumOfNarcissus = 0;
        double sumOfGladiolus = 0;

        if ("Roses".equals(typeFlowers)){
            sumOfRoses = countFlowers * 5.00;
        }else if ("Dahlias".equals(typeFlowers)){
            sumOfDahlias = countFlowers * 3.80;
        }else if ("Tulips".equals(typeFlowers)){
            sumOfTulips = countFlowers * 2.80;
        }else if ("Narcissus".equals(typeFlowers)){
            sumOfNarcissus = countFlowers * 3.00;
        }else if ("Gladiolus".equals(typeFlowers)){
            sumOfGladiolus = countFlowers * 2.50;
        }

        double totalSum = sumOfRoses + sumOfDahlias + sumOfTulips + sumOfNarcissus + sumOfGladiolus;

        if ("Roses".equals(typeFlowers) && countFlowers > 80){
            totalSum = totalSum - totalSum * 0.10;
        } else if ("Dahlias".equals(typeFlowers) && countFlowers > 90) {
            totalSum = totalSum - totalSum * 0.15;
        } else if ("Tulips".equals(typeFlowers) && countFlowers > 80) {
            totalSum = totalSum - totalSum * 0.15;
        } else if ("Narcissus".equals(typeFlowers) && countFlowers < 120) {
            totalSum = totalSum + totalSum * 0.15;            
        } else if ("Gladiolus".equals(typeFlowers) && countFlowers < 80) {
            totalSum = totalSum + totalSum * 0.20;
        }

        if (budget >= totalSum){
            double finalSum = budget - totalSum;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, typeFlowers, finalSum);
        }

        if (budget < totalSum){
            double finalSum = totalSum - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", finalSum);
        }
    }
}
