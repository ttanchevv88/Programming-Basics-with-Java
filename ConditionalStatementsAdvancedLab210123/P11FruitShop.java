package ConditionalStatementsAdvancedLab210123;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String days = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        boolean workDays = days.equals("Monday") ||
                days.equals("Tuesday") ||
                days.equals("Wednesday") ||
                days.equals("Thursday") ||
                days.equals("Friday");

        boolean weekend = days.equals("Saturday") ||
                days.equals("Sunday");


        if (workDays) {
            if ("banana".equals(fruit)) {
                sum = quantity * 2.50;
                System.out.printf("%.2f", sum);
            } else if ("apple".equals(fruit)) {
                sum = quantity * 1.20;
                System.out.printf("%.2f", sum);
            } else if ("orange".equals(fruit)) {
                sum = quantity * 0.85;
                System.out.printf("%.2f", sum);
            } else if ("grapefruit".equals(fruit)) {
                sum = quantity * 1.45;
                System.out.printf("%.2f", sum);
            } else if ("kiwi".equals(fruit)) {
                sum = quantity * 2.70;
                System.out.printf("%.2f", sum);
            } else if ("pineapple".equals(fruit)) {
                sum = quantity * 5.50;
                System.out.printf("%.2f", sum);
            } else if ("grapes".equals(fruit)) {
                sum = quantity * 3.85;
                System.out.printf("%.2f", sum);
            }else {
                System.out.println("error");
            }
        }else if (weekend){
            if ("banana".equals(fruit)){
                sum = quantity * 2.70;
                System.out.printf("%.2f", sum);
            } else if ("apple".equals(fruit)) {
                sum = quantity * 1.25;
                System.out.printf("%.2f", sum);
            }else if ("orange".equals(fruit)) {
                sum = quantity * 0.90;
                System.out.printf("%.2f", sum);
            }else if ("grapefruit".equals(fruit)) {
                sum = quantity * 1.60;
                System.out.printf("%.2f", sum);
            }else if ("kiwi".equals(fruit)) {
                sum = quantity * 3.00;
                System.out.printf("%.2f", sum);
            }else if ("pineapple".equals(fruit)) {
                sum = quantity * 5.60;
                System.out.printf("%.2f", sum);
            }else if ("grapes".equals(fruit)) {
                sum = quantity * 4.20;
                System.out.printf("%.2f", sum);
            }else {
                System.out.println("error");
            }
        }else {
            System.out.println("error");
        }
    }
}
