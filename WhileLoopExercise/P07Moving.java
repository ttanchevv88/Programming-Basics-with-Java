package WhileLoopExercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        int volumeRoom = h * w * l;

        int volumeBags = 0;

        while (volumeRoom >= volumeBags){
            String boxSize = scanner.nextLine();
            if (!boxSize.equals("Done")){
                int size = Integer.parseInt(boxSize);
                volumeBags += size;
            }

            if (boxSize.equals("Done")){
                break;
            }
        }

        if (volumeRoom > volumeBags){
            int result = volumeRoom - volumeBags;
            System.out.printf("%d Cubic meters left.", result);
        }else {
            int result = Math.abs(volumeRoom - volumeBags);
            System.out.printf("No more free space! You need %d Cubic meters more.", result);
        }
    }
}
