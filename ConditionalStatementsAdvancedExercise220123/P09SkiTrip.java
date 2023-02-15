package ConditionalStatementsAdvancedExercise220123;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();

        int totalNight = days - 1;
        double oneRoom = totalNight * 18;
        double apartment = totalNight * 25;
        double presidentRoom = totalNight * 35;
        double totalSum = 0;

        if ("room for one person".equals(room)){
            if ("positive".equals(rating)){
                totalSum = oneRoom + (oneRoom * 0.25);
            } else if ("negative".equals(rating)) {
                totalSum = oneRoom - (oneRoom * 0.10);
            }
            System.out.printf("%.2f", totalSum);
        } else if ("apartment".equals(room)) {
            totalSum = totalNight * apartment;
            if (totalNight > 10 && totalNight <= 15){
                totalSum = apartment - (apartment * 0.35);
            } else if (totalNight > 15) {
                totalSum = apartment - (apartment * 0.50);
            }else {
                totalSum = apartment - (apartment * 0.30);
            }
            if ("positive".equals(rating)){
                totalSum = totalSum + (totalSum * 0.25);
            } else if ("negative".equals(rating)) {
                totalSum = totalSum - (totalSum * 0.10);
            }
            System.out.printf("%.2f", totalSum);
        }else if ("president apartment".equals(room)) {
            totalSum = totalNight * presidentRoom;
            if (totalNight > 10 && totalNight <= 15){
                totalSum = presidentRoom - (presidentRoom * 0.15);
            } else if (totalNight > 15) {
                totalSum = presidentRoom - (presidentRoom * 0.20);
            }else {
                totalSum = presidentRoom - (presidentRoom * 0.10);
            }
            if ("positive".equals(rating)){
                totalSum = totalSum + (totalSum * 0.25);
            } else if ("negative".equals(rating)) {
                totalSum = totalSum - (totalSum * 0.10);
            }
            System.out.printf("%.2f", totalSum);
        }

    }
}
