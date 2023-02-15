package FirstStepsInCodingExercise.FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P09WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if (str.equals("sunny")){
            System.out.println("It's warm outside!");
        } else if (!str.equals("sunny")) {
            System.out.println("It's cold outside!");
        }
    }
}
