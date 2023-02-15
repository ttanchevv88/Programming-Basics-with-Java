package ConditionalStatementsAdvancedLab210123;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        if ("Sofia".equals(city)){
            if ("coffee".equals(product)){
                sum = quantity * 0.50;
                System.out.println(sum);
            }
            if ("water".equals(product)){
                sum = quantity * 0.80;
                System.out.println(sum);
            }
            if ("beer".equals(product)){
                sum = quantity * 1.20;
                System.out.println(sum);
            }
            if ("sweets".equals(product)){
                sum = quantity * 1.45;
                System.out.println(sum);
            }
            if ("peanuts".equals(product)){
                sum = quantity * 1.60;
                System.out.println(sum);
            }
        }

        if ("Plovdiv".equals(city)){
            if ("coffee".equals(product)){
                sum = quantity * 0.40;
                System.out.println(sum);
            }
            if ("water".equals(product)){
                sum = quantity * 0.70;
                System.out.println(sum);
            }
            if ("beer".equals(product)){
                sum = quantity * 1.15;
                System.out.println(sum);
            }
            if ("sweets".equals(product)){
                sum = quantity * 1.30;
                System.out.println(sum);
            }
            if ("peanuts".equals(product)){
                sum = quantity * 1.50;
                System.out.println(sum);
            }
        }

        if ("Varna".equals(city)){
            if ("coffee".equals(product)){
                sum = quantity * 0.45;
                System.out.println(sum);
            }
            if ("water".equals(product)){
                sum = quantity * 0.70;
                System.out.println(sum);
            }
            if ("beer".equals(product)){
                sum = quantity * 1.10;
                System.out.println(sum);
            }
            if ("sweets".equals(product)){
                sum = quantity * 1.35;
                System.out.println(sum);
            }
            if ("peanuts".equals(product)){
                sum = quantity * 1.55;
                System.out.println(sum);
            }
        }
    }
}
