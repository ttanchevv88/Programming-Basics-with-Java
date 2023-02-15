package ForLoopExercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers;

            if (numbers > max){
                max = numbers;
            }

        }

        int sumWithoutMaxNumbers = sum - max;

        if (sumWithoutMaxNumbers == max){
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", max);
        }else {
            int result = Math.abs(max - sumWithoutMaxNumbers);
            System.out.printf("No%n");
            System.out.printf("Diff = %d", Math.abs(result));
        }
    }
}
