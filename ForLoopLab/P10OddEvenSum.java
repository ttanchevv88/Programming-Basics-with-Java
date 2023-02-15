package ForLoopLab;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            int numbs = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                evenSum += numbs;
            }else {
                oddSum += numbs;
            }
        }
        if (oddSum == evenSum){
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", oddSum);
        }else {
            int result = oddSum - evenSum;
            System.out.printf("No%n");
            System.out.printf("Diff = %d", Math.abs(result));
        }

    }
}
