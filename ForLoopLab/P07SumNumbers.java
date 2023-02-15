package ForLoopLab;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numb = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < numb ; i++) {
            int numb2 = Integer.parseInt(scanner.nextLine());
            sum = sum + numb2;
        }
        System.out.println(sum);
    }
}
