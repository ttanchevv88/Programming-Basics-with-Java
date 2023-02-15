package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lengthCm = Integer.parseInt(sc.nextLine());
        int widthCm = Integer.parseInt(sc.nextLine());
        int heightCm = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());

        int volume = lengthCm * widthCm * heightCm;

        double volumeOnLiters = volume * 0.001;

        double busySpace = percent / 100;

        double totalResult = volumeOnLiters * (1 - busySpace);

        System.out.println(totalResult);


    }
}
