package WhileLoopLab;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String text = scaner.nextLine();

        while(!text.equals("Stop")){
            System.out.println(text);
            text = scaner.nextLine();
        }
    }
}
