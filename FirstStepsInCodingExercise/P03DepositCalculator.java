package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double deposit = Double.parseDouble(scanner.nextLine());
        int moth = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        double countDeposit = deposit * (interest / 100);

        double mothInterest = countDeposit / 12;

        double totalResult = deposit + (moth * mothInterest);

        System.out.println(totalResult);


    }
}
