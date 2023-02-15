package ForLoopLab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            int numbs = Integer.parseInt(scanner.nextLine());
            sum1 += numbs;
        }

        for (int i = 0; i < n; i++) {
            int numbs = Integer.parseInt(scanner.nextLine());
            sum2 += numbs;
        }

        if (sum1 == sum2){
            System.out.printf("Yes, sum = %d", sum1);
        }else {
            int result = sum2 - sum1;
            System.out.printf("No, diff = %d", Math.abs(result));
        }
    }
}
