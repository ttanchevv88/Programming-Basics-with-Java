package ConditionalStatementsExercise150123;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());

        int hours = inputHours;
        int minutes = inputMinutes + 15;
        int totalMinutes = minutes % 60;

        if (minutes > 59){
            hours = hours + 1;
        }
        if (hours > 23) {
            hours = 0;
        }
        if (totalMinutes < 10){
            System.out.printf("%d:0%d", hours, totalMinutes);
        } else {
            System.out.printf("%d:%d", hours, totalMinutes);
        }
    }
}
