package ConditionalStatementsExercise150123;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        double timeFilm = Double.parseDouble(scanner.nextLine());
        double timeBreak = Double.parseDouble(scanner.nextLine());

        double time1 = timeBreak / 8;
        double time2 = timeBreak / 4;

        double leftTime = timeBreak - time1 - time2;

        if (leftTime >= timeFilm){
            double finalTime =leftTime - timeFilm;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", filmName, Math.ceil(finalTime));
        }else {
           double finalTime = leftTime - timeFilm;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", filmName , Math.ceil(Math.abs(finalTime)));
        }
    }
}
