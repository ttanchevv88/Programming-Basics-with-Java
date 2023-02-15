package WhileLoopLab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxValue = Integer.MAX_VALUE;

        while (!input.equals("Stop")){
            int numb = Integer.parseInt(input);
            input = scanner.nextLine();
            if (numb < maxValue){
                maxValue = numb;
            }
        }
        System.out.println(maxValue);
    }
}
