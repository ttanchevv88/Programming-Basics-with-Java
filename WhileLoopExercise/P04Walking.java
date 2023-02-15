package WhileLoopExercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int total = 0;

        while (!input.equals("Going home")){
            int numb = Integer.parseInt(input);
            total += numb;
            if (total >= 10000){
               break;
            }
            input = scanner.nextLine();
        }

        if (input.equals("Going home")){
            int finalStep = Integer.parseInt(scanner.nextLine());
            total += finalStep;
        }

        if (total >= 10000){
            int result = total - 10000;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", result);
        } else {
            int result = 10000 - total;
            System.out.printf("%d more steps to reach goal.", result);
        }
    }
}
