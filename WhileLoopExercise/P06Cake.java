package WhileLoopExercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());

        int allParts = h * w;
        int parts = 0;

        while (allParts >= parts){
            String takeParts = scanner.nextLine();
            if (!takeParts.equals("STOP")){
                int leftParts = Integer.parseInt(takeParts);
                parts += leftParts;
            }
            if (takeParts.equals("STOP")){
                break;
            }
        }
        if (allParts > parts){
            int result = allParts - parts;
            System.out.printf("%d pieces are left.", result);
        }else {
            int result = Math.abs(allParts - parts);
            System.out.printf("No more cake left! You need %d pieces more.", result);
        }
    }
}
