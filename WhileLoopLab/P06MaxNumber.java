package WhileLoopLab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxValue = Integer.MIN_VALUE;

        int numb = 0;
        while (!input.equals("Stop")) {
            numb = Integer.parseInt(input);
            if (numb > maxValue) {
                maxValue = numb;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxValue);
    }
}
