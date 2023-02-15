package ConditionalStatementsLab;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = Integer.parseInt(scanner.nextLine());

        if (result >= 5){
            System.out.println("Excellent!");
        }

    }
}
