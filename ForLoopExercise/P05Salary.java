package ForLoopExercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countTabs; i++) {
            String siteName = scanner.nextLine();

            if (siteName.equals("Facebook")){
                salary -= 150;
            } else if (siteName.equals("Instagram")) {
                salary -= 100;
            } else if (siteName.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
