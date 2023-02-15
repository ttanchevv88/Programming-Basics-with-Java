package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagePerHours = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());

        int totalTime = bookPages / pagePerHours;
        int hoursDays = totalTime / countDays;

        System.out.println(hoursDays);
    }
}
