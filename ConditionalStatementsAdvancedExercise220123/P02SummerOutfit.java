package ConditionalStatementsAdvancedExercise220123;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String daysOfTime = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {
            if (daysOfTime.equals("Morning")) {
                outfit ="Sweatshirt";
                shoes = "Sneakers";
            }else if (daysOfTime.equals("Afternoon")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (daysOfTime.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }else if (degrees > 18 && degrees <= 24) {
            if (daysOfTime.equals("Morning")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (daysOfTime.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (daysOfTime.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }else if (degrees >= 25) {
            if (daysOfTime.equals("Morning")) {
                outfit ="T-Shirt";
                shoes = "Sandals";
            }else if (daysOfTime.equals("Afternoon")) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }else if (daysOfTime.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
