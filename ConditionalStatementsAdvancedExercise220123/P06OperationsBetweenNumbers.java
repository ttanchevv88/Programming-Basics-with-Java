package ConditionalStatementsAdvancedExercise220123;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operators = scanner.nextLine();

        double result = 0;

        if (operators.equals("+")){
            result = num1 + num2;
            if (result % 2 == 0){
                System.out.printf("%d + %d = %.0f - even", num1, num2, result);
            }else {
                System.out.printf("%d + %d = %.0f - odd", num1, num2, result);
            }
        }

        if (operators.equals("-")){
            result = num1 - num2;
            if (result % 2 == 0){
                System.out.printf("%d - %d = %.0f - even", num1, num2, result);
            }else {
                System.out.printf("%d - %d = %.0f - odd", num1, num2, result);
            }
        }

        if (operators.equals("*")){
            result = num1 * num2;
            if (result % 2 == 0){
                System.out.printf("%d * %d = %.0f - even", num1, num2, result);
            }else {
                System.out.printf("%d * %d = %.0f - odd", num1, num2, result);
            }
        }

        if (operators.equals("/")) {
            if (num2 != 0) {
                result = (double) num1 / num2;
                System.out.printf("%d / %d = %.2f", num1, num2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", num1);
            }
        }

        if(operators.equals("%")){
            if (num2 == 0){
                System.out.println("Cannot divide "+num1+" by zero");
            }else {
                result = num1 % num2;
                System.out.printf("%d %% %d = %.0f", num1, num2, result);
            }
        }
    }
}
