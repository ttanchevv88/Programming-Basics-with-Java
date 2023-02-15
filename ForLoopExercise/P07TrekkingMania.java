package ForLoopExercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        double totalPpl = 0;
        double musalaPpl = 0;
        double monblanPpl = 0;
        double kilimandjaroPpl = 0;
        double k2Ppl = 0;
        double everestPpl = 0;

        for (int i = 1; i <= groups ; i++) {
            int ppl = Integer.parseInt(scanner.nextLine());

            totalPpl += ppl; // All people
            if (ppl <= 5){
                musalaPpl += ppl;
            } else if (ppl <= 12) {
                monblanPpl += ppl;
            } else if (ppl <= 25) {
                kilimandjaroPpl += ppl;
            } else if (ppl <= 40) {
                k2Ppl += ppl;
            } else {
                everestPpl += ppl;
            }
        }
        musalaPpl = (musalaPpl / totalPpl) * 100;
        monblanPpl = (monblanPpl / totalPpl) * 100;
        kilimandjaroPpl = (kilimandjaroPpl / totalPpl) * 100;
        k2Ppl = (k2Ppl / totalPpl) * 100;
        everestPpl = (everestPpl / totalPpl) * 100;

        System.out.printf("%.2f%%%n", musalaPpl);
        System.out.printf("%.2f%%%n", monblanPpl);
        System.out.printf("%.2f%%%n", kilimandjaroPpl);
        System.out.printf("%.2f%%%n", k2Ppl);
        System.out.printf("%.2f%%%n", everestPpl);
    }
}
