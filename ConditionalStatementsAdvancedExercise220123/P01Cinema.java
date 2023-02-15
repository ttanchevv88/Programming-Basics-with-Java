package ConditionalStatementsAdvancedExercise220123;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if ("Premiere".equals(type)){
            income = r * c * 12.00;
        }else if ("Normal".equals(type)){
            income = r * c * 7.50;
        }else if ("Discount".equals(type)){
            income = r * c * 5.00;
        }

        System.out.printf("%.2f leva", income);
    }
}
