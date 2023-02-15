package ForLoopExercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ▪ W - ако е победител получава 2000 точки
//        ▪ F - ако е финалист получава 1200 точки
//        ▪ SF - ако е полуфиналист получава 720 точки

        int countMatch = Integer.parseInt(scanner.nextLine());
        int countPoints = Integer.parseInt(scanner.nextLine());

        int totalPoint = 0;
        int countWins = 0;
        for (int i = 1; i <= countMatch ; i++) {
            String type = scanner.nextLine();

            if (type.equals("W")){
                countWins++;
                totalPoint += 2000;
            } else if (type.equals("F")) {
                totalPoint += 1200;
            } else if (type.equals("SF")) {
                totalPoint += 720;
            }
        }
        int finalPoints = totalPoint + countPoints;
        int averagePoints = totalPoint / countMatch;
        double percentWins = (countWins * 1.0 / countMatch) * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%%n", percentWins);
    }
}
