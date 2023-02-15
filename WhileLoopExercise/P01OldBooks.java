package WhileLoopExercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int countBooks = 0;
        boolean isFound = false;
        String input = scanner.nextLine();
        while (!input.equals("No More Books")){
            if (input.equals(bookName)){
                isFound = true;
                break;
            }
            countBooks++;
            input = scanner.nextLine();
        }

        if (isFound){
            System.out.printf("You checked %d books and found it.", countBooks);;
        }else {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
