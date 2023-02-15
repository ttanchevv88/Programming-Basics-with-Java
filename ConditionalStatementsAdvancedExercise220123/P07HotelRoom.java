package ConditionalStatementsAdvancedExercise220123;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String moth = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());

        double sumStudio = 0;
        double sumApartment = 0;

        if ("May".equals(moth) || "October".equals(moth)){
            sumStudio = countDays * 50;
            sumApartment = countDays * 65;
            if (countDays > 7 && countDays <= 14){
                sumStudio = sumStudio - sumStudio * 0.05;
            }
            if (countDays > 14) {
                sumStudio = sumStudio - sumStudio * 0.30;
            }

            if (countDays > 14){
                sumApartment = sumApartment - sumApartment * 0.10;
            }

        } else if ("June".equals(moth) || "September".equals(moth)) {
                sumStudio = countDays * 75.20;
                sumApartment = countDays * 68.70;
                if (countDays > 14){
                    sumStudio = sumStudio - sumStudio * 0.20;
                    sumApartment = sumApartment - sumApartment * 0.10;
                }
        } else if ("July".equals(moth) || "August".equals(moth)) {
                sumStudio = countDays * 76;
                sumApartment = countDays * 77;

                if (countDays > 14){
                    sumApartment = sumApartment - sumApartment * 0.10;
                }
        }

        System.out.printf("Apartment: %.2f lv. \n", sumApartment);
        System.out.printf("Studio: %.2f lv. \n", sumStudio);
    }
}
