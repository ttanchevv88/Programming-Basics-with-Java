package ConditionalStatementsAdvancedExercise220123;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double sum = 0;
        String destination = "";
        String type = "";

        if (budget <= 100){
            if (season.equals("summer")){
                sum = budget - budget * 0.30;
                type = "Camp";
            } else if (season.equals("winter")) {
                sum = budget - budget * 0.70;
                type = "Hotel";
            }
            destination = "Bulgaria";
        } else if (budget <= 1000) {
            if (season.equals("summer")){
                sum = budget - budget * 0.40;
                type = "Camp";
            }else if (season.equals("winter")){
                sum = budget - budget * 0.80;
                type = "Hotel";
            }
            destination = "Balkans";
        } else if (budget > 1000) {
            if (season.equals("winter")){
                sum = budget - budget * 0.90;
                type = "Hotel";
                destination = "Europe";
            } else if (season.equals("summer")) {
                sum = budget - budget * 0.90;
                type = "Hotel";
                destination = "Europe";
            }
        }
        double total = budget - sum;
        System.out.println("Somewhere in "+destination);
        System.out.printf("%s - %.2f", type, total);
    }
}
