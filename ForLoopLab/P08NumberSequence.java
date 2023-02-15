package ForLoopLab;

import com.sun.jdi.Value;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumb = Integer.MIN_VALUE;
        int minNumb = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int numbs = Integer.parseInt(scanner.nextLine());

            if (maxNumb < numbs){
                maxNumb = numbs;
            }
            if (minNumb > numbs){
                minNumb = numbs;
            }
        }
        System.out.printf("Max number: %d%n", maxNumb);
        System.out.printf("Min number: %d%n", minNumb);
    }
}
