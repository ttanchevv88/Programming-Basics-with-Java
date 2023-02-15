package ConditionalStatementsExercise150123;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Цени на играчките:
        · Пъзел - 2.60 лв.
        · Говореща кукла - 3 лв.
        · Плюшено мече - 4.10 лв.
        · Миньон - 8.20 лв.
        · Камионче - 2 лв.
        Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        От спечелените пари Петя трябва да даде 10% за наема на магазина.
        Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.
         */

        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        int toysCount = puzzlesCount + dollsCount + bearsCount + minionsCount + trucksCount;

        //Суми за брой играчки
        double puzzlesPrice = puzzlesCount * 2.60;
        double dollsPrice = dollsCount * 3;
        double bearsPrice = bearsCount * 4.10;
        double minionsPrice = minionsCount * 8.20;
        double trucksPrice = trucksCount * 2;

        double toysSum = puzzlesPrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;

        if (toysCount >= 50){
            double discount = toysSum * 0.25;
            toysSum = toysSum - discount;
        }

        double rent = toysSum * 0.10;
        double totalSum = toysSum - rent;

        if (totalSum > tourPrice){
            double moneyLeft = totalSum - tourPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        }else {
            double moneyLeft = tourPrice - totalSum;
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }



    }
}
