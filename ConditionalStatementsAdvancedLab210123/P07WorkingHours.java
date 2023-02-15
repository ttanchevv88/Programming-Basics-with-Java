package ConditionalStatementsAdvancedLab210123;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String days = scanner.nextLine();


        if (num >= 10 && num <= 18 ){
            switch (days){
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");
                    break;
            }
        }else {
            System.out.println("closed");
        }
    }
}
