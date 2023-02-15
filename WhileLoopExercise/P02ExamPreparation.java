package WhileLoopExercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFails = Integer.parseInt(scanner.nextLine());
        int contLowGrade = 0; //брояч за незадоволителни оценки
        int countProblems = 0; //брояч за решените упражнения
        double totalGrade = 0; //сумата на всички оценки
        boolean isFalse = true;
        String nameProblem = "";

        while (contLowGrade < countFails){
            String problem = scanner.nextLine();
            if (problem.equals("Enough")){
                isFalse = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4){
                contLowGrade ++;
            }

            totalGrade+= grade;
            nameProblem = problem;
            countProblems ++;
        }
        if (isFalse){
            System.out.printf("You need a break, %d poor grades.", contLowGrade);
        }else {
            double finalGrade = totalGrade / countProblems;
            System.out.printf("Average score: %.2f%n", finalGrade);
            System.out.printf("Number of problems: %d%n", countProblems);
            System.out.printf("Last problem: %s%n", nameProblem);
        }


    }
}
