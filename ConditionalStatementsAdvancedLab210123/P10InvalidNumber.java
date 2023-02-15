package ConditionalStatementsAdvancedLab210123;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = Integer.parseInt(scanner.nextLine());

        boolean isValidNumber = numb >= 100 && numb <= 200 || numb == 0;

        if (isValidNumber){
            System.out.println();
        }else {
            System.out.println("invalid");
        }
    }
}
