package ForLoopExercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointOfAcademy = Double.parseDouble(scanner.nextLine());
        int countCommission = Integer.parseInt(scanner.nextLine());

        double finalPoints = pointOfAcademy;

        for (int i = 1; i <= countCommission; i++) {
            String nameComm = scanner.nextLine();
            double poinsOfComm = Double.parseDouble(scanner.nextLine());

           finalPoints += ((nameComm.length() * poinsOfComm) / 2);
            if (finalPoints >= 1250.5){
                System.out.printf("%nCongratulations, %s got a nominee for leading role with %.1f!", actorName, finalPoints);
                break;
            }
        }

        if (finalPoints < 1250.5){
            double diff = 1250.5 - finalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }
    }
}
