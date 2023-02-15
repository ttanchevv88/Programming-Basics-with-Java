package ForLoopExercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearsLily = Integer.parseInt(scanner.nextLine());
        double washingPrice = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());

        double money = 0;
        int toys = 0;
        double bro = 0;

        for (int i = 1; i <= yearsLily; i++) {
            if (i % 2 == 0){
                money = money + (i * 5);
                bro++;
            }else {
                toys++;
            }
        }
        double totalMoney = money + (toys * toysPrice) - bro;

        if (totalMoney >= washingPrice){
            double dreg = totalMoney - washingPrice;
            System.out.printf("Yes! %.2f", dreg);
        }else {
            double deficit = washingPrice - totalMoney;
            System.out.printf("No! %.2f", deficit);
        }
    }
}
