package ConditionalStatementsAdvancedExercise220123;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherMan = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (season.equals("Spring")) {
            sum = 3000;
        } else if (season.equals("Summer")) {
            sum = 4200;
        }else if (season.equals("Autumn")){
            sum = 4200;
        } else if (season.equals("Winter")) {
            sum = 2600;
        }

        if (fisherMan <= 6){
            sum = sum - sum * 0.10;
        } else if (fisherMan <= 11) {
            sum = sum - sum * 0.15;
        } else if (fisherMan > 12) {
            sum = sum - sum * 0.25;
        }

        if (season.equals("Spring") && fisherMan % 2 == 0){
            sum = sum - (sum * 0.05);
        } else if (season.equals("Summer") && fisherMan % 2 == 0){
            sum = sum - (sum * 0.05);
        } else if (season.equals("Winter") & fisherMan % 2 == 0){
            sum = sum - (sum * 0.05);
        }

        double total = Math.abs(budget - sum);

        if (budget >= sum){
            System.out.printf("Yes! You have %.2f leva left.", total);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", total);
        }
    }
}
