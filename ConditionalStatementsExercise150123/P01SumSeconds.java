package ConditionalStatementsExercise150123;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSeconds = Integer.parseInt(scanner.nextLine());
        int secondSeconds = Integer.parseInt(scanner.nextLine());
        int lastSeconds = Integer.parseInt(scanner.nextLine());

        int sumSeconds = firstSeconds + secondSeconds + lastSeconds;

        int sumMin = sumSeconds / 60;
        int sumSec = sumSeconds % 60;

        if (sumSec < 10){
            System.out.printf("%d:0%d", sumMin, sumSec);
        }else {
            System.out.printf("%d:%d", sumMin, sumSec);
        }


    }
}
