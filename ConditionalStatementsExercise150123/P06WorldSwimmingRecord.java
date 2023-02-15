package ConditionalStatementsExercise150123;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double timeOnSec = distance * time;
        double addedTime = Math.floor(distance / 15) * 12.5;
        double totalTime = timeOnSec + addedTime;

        if (record <= totalTime){
            double result = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(result));

        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);

        }
    }
}
